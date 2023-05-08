package app.core.web;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileController {

	private String fileUploadPath = "src/main/resources/static/images";

	@PostMapping("/upload/file")
	public String handleFileUpload(@RequestParam("file") MultipartFile file) throws IllegalStateException, IOException {
		String originalFileName = file.getOriginalFilename();
		String absulutePath = Paths.get(fileUploadPath).toAbsolutePath().normalize().toString();
		File destinationFile = new File(absulutePath, originalFileName);
		file.transferTo(destinationFile);
		System.out.println(destinationFile);
		return "uploaded file: " + originalFileName;
	}

}
