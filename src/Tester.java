
public class Tester {

	public static void main(String[] args) {

		Lexer lexicalAnalyzer = new Lexer();
		String filePath = "files/file_input.txt";

		if (lexicalAnalyzer.initialize(filePath)) {

			Token token;
			try {
				while ((token = lexicalAnalyzer.nextToken()) != null) {
					System.out.println(token);
				}
			} catch (Exception e) {
				System.out.println("File parsing ended!!");
			}

		} else {
			System.out.println("File not found!!");
		}
	}

}