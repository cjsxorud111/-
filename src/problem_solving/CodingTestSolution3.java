package problem_solving;

class CodingTestSolution3 {
	public static int solution(String[] B) {
		int num = B.length;
		
		/*for (int i = 0; i < B.length; i++) {
			num++;
		}*/
		
		char[][] array_word = new char[num][num];
		
		int result = 0;
		
		for (int i1 = 0; i1 < array_word.length; i1++) {

			for (int i = 0; i < array_word.length; i++) {

				array_word[i1][i] = (B[i1].charAt(i));

			}

		}

		for (int i2 = 0; i2 < array_word.length; i2++) {

			for (int i1 = 0; i1 < array_word.length; i1++) {

				for (int i = 0; i < array_word.length; i++) {

					if (array_word[i1][i] == 'O') {
						System.out.println(array_word[i1][i] + "¿©±âÅ¸³Ä" + i1 + " " + i);
						
						
						if (0 <= i - 1 && i1 - 1 >= 0) {
							if (array_word[i1 - 1][i - 1] == 'X') {
								if (0 <= i-2&& i1 - 2>=0) {
									System.out.println(array_word[i1][i] + "¿©±â???" + i1 + " " + i);

									if (array_word[i1 - 2][i - 2] == 'X') {
										System.out.println(array_word[i1][i] + "dhdld¿ËÀÌ" + i1 + " " + i);
									} else {

										array_word[i1 - 2][i - 2] = 'O';
										array_word[i1][i] = 'X';
										result++;
										System.out.println(result+"°¼°ú??");
									}
								}

							}
						}
						

						if (i + 1 < num&& i1 - 1>=0) {

							if (array_word[i1 - 1][i + 1] == 'X') {
								
								if (i + 2 < num&& i1 - 2>=0) {
									if (array_word[i1 - 2][i + 2] == 'X') {
										System.out.println("¿©ÀÀ±âÀÕ" + i1 + " ¿õ±ê¿õ½Ä" + i);
									} else {
										System.out.println("¿©ÀÀ±âÀÕ" + i1 + " " + i);
										array_word[i1 - 2][i + 2] = 'O';
										array_word[i1][i] = 'X';
										result++;
										System.out.println(result+"°¼°ú");
									}
								}
								
							}

						}

					}

				}

			}
		}

		return result;
	}

	public static void main(String[] args) {
		String[] number = { "X....", ".X...", "..O..", "...X.", "....."};

		System.out.println(solution(number));
	}
}