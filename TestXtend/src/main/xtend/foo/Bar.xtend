package foo

import java.io.BufferedInputStream
import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.stream.Collectors

class Bar {
	
	def static void main(String... args) {
		try(val foo = new BufferedInputStream(System.in)) {
			val bar = [| bar(foo)]
			bar.apply
		}
	}
	
	def static void bar(BufferedInputStream bis) {
		System.out.println(new BufferedReader((new InputStreamReader(bis))).lines().collect(Collectors.joining("\n")))
	}
	
}