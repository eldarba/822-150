package app.core.web;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class ControllerA {
	
	@Autowired
	private RestTemplate rt; // used to make http requests
	
	// DiscoveryClient is used to get information from the discovery server e.g. all instances of B
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@Autowired
	private LoadBalancerClient loadBalancerClient;
	
	@HystrixCommand(fallbackMethod = "handleAFallback")
	@GetMapping("/service/a")
	public String handleA() {
//		// use the method below to get the base address of an instance of service-b
//		URI uri = getServiceUriLB("service-b");
//		// create the url by adding the endpoint path to the base URI
//		String url = uri + "/service/b";
//		// use the RestTemplate to send an HTTP request to service-b 
//		String responseFromB = rt.getForObject(url, String.class);
//		// concatenate the response from B to the A response
//		return "Service A: " + responseFromB;
		
		String responseFromB = rt.getForObject("http://service-b/service/b", String.class);
		return "Service A: " + responseFromB;
	}
	
	public String handleAFallback(Throwable t) {
		return "service a fallback message: can't call service b: " + t;
	}
	
	// this method get a name of a service and return a base address load balanced
	URI getServiceUriLB(String serviceId) {
		ServiceInstance instance = loadBalancerClient.choose(serviceId);
		return instance.getUri();
	}
	
	// this method get a name of a service and return its base address IP + Port
	URI getServiceUri(String serviceId) {
		// use the DiscoveryClient object to find all instances of service B as a List
		List<ServiceInstance> instancesOfServiceB =  this.discoveryClient.getInstances(serviceId);
		// chose the first instance from the list
		ServiceInstance instance = instancesOfServiceB.get(0);
		// get the URI of this instance - root address: IP + Port
		return instance.getUri();
	}
	
	

}
