// module declaration - set the module name
module module1 {
	
	// module directives
	// by default all packages are module private
	// the exports directive sets which packages are public
	exports module1.a to module2; // exports to module2 only
	exports module1.b; // exports to all modules
	
	// enable reflective access to private field
	opens module1.b to module2; // open to module2 only
//	opens module1.b; // open to all modules
}