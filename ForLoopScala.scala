object ForLoop {
	def main(args: Array[String]){
		
		for(i <- 1.to(10)){  
			println(i);
		}

		for(i <- 1 until 11){
			println(i);
		}

		var lst = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		for(i <- lst){
			println(i);
		}
	}
}