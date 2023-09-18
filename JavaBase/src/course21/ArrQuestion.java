package course21;

import java.util.Scanner;

public class ArrQuestion {

	public static void main(String[] args) {

		int[] typhoon = new int[12];

		typhoon[0] = 1;
		typhoon[1] = 1;
		typhoon[2] = 0;
		typhoon[3] = 0;
		typhoon[4] = 0;
		typhoon[5] = 1;
		typhoon[6] = 4;
		typhoon[7] = 5;
		typhoon[8] = 6;
		typhoon[9] = 4;
		typhoon[10] = 6;
		typhoon[11] = 1;

		int[] quike = new int[12];

		quike[0] = 153;
		quike[1] = 127;
		quike[2] = 130;
		quike[3] = 109;
		quike[4] = 118;
		quike[5] = 164;
		quike[6] = 130;
		quike[7] = 103;
		quike[8] = 103;
		quike[9] = 104;
		quike[10] = 123;
		quike[11] = 141;

		int[] rain = new int[12];

		rain[0] = 20;
		rain[1] = 58;
		rain[2] = 107;
		rain[3] = 87;
		rain[4] = 114;
		rain[5] = 187;
		rain[6] = 200;
		rain[7] = 59;
		rain[8] = 169;
		rain[9] = 441;
		rain[10] = 158;
		rain[11] = 94;

		int z = 0;

		Scanner stdIn = new Scanner(System.in);
		System.out.println("見たい情報を選択してください。");

		System.out.println("1：台風件数　2：地震件数　3:降水量");
		int x = stdIn.nextInt();

		System.out.println("年別か月別かを選んでください。");
		int y = stdIn.nextInt();

		//台風の年別
		if (x == 1) {
			if (y == 1) {
			}
			//台風の件数総和を求める。
			int sum = 0;
			for (int i = 0; i < 12; i++) {
				sum = sum + typhoon[i];
			}
			System.out.println("1年間の台風の総合計は" + sum + "です。");
		}

		//地震の年別
		if (x == 2) {
			if (y == 1) {
				//地震の総和を求める。
				int sum = 0;
				for (int i = 0; i < 12; i++) {
					sum = sum + quike[i];
				}
				System.out.println("1年間の地震の総合計は" + sum + "です。");
			}
		}if (x == 3) {
			if (y == 1) {
				int sum = 0;
				for (int i = 0; i < 12; i++) {
					sum = sum + rain[i];
				}
				System.out.println("1年間の降水量の総合計は" + sum + "です。");
			}
			{
				if (x == 1) {
					if (y == 2) {
						System.out.println("見たい月を入力してください。");
						z = stdIn.nextInt();
						if (z == 1) {
							System.out.println("1月の台風の件数は" + typhoon[0] + "です。");
						}
					}
					if (x == 1) {
						if (y == 2) {
							if (z == 2) {
								System.out.println("2月の台風の件数は" + typhoon[1] + "です。");
							}
						}
					}
					if (x == 1) {
						if (y == 2) {
							if (z == 3) {
								System.out.println("3月の台風の件数は" + typhoon[2] + "です。");
							}
						}
					}
					if (x == 1) {
						if (y == 2) {
							if (z == 4) {
								System.out.println("4月の台風の件数は" + typhoon[3] + "です。");
							}
						}
					}
					if (x == 1) {
						if (y == 2) {
							if (z == 5) {
								System.out.println("5月の台風の件数は" + typhoon[4] + "です。");
							}
						}
					}
					if (x == 1) {
						if (y == 2) {
							if (z == 6) {
								System.out.println("6月の台風の件数は" + typhoon[5] + "です。");
							}
						}
					}
					if (x == 1) {
						if (y == 2) {
							if (z == 7) {
								System.out.println("7月の台風の件数は" + typhoon[6] + "です。");
							}
						}
					}
					if (x == 1) {
						if (y == 2) {
							if (z == 8) {
								System.out.println("8月の台風の件数は" + typhoon[7] + "です。");
							}
						}
					}
					if (x == 1) {
						if (y == 2) {
							if (z == 9) {
								System.out.println("9月の台風の件数は" + typhoon[8] + "です。");
							}
						}
					}
					if (x == 1) {
						if (y == 2) {
							if (z == 10) {
								System.out.println("10月の台風の件数は" + typhoon[9] + "です。");
							}
						}
					}
					if (x == 1) {
						if (y == 2) {
							if (z == 11) {
								System.out.println("11月の台風の件数は" + typhoon[10] + "です。");
							}
						}
					}
					if (x == 1) {
						if (y == 2) {
							if (z == 12) {
								System.out.println("12月の台風の件数は" + typhoon[11] + "です。");
							}
						}
						if (x == 2) {
							if (y == 2) {
								if (z == 1) {
									System.out.println("1月の地震の件数は" + quike[0] + "です。");
								}
							}
						}

						if (x == 2) {
							if (y == 2) {
								if (z == 2) {
									System.out.println("2月の地震の件数は" + quike[1] + "です。");
								}
							}
						}

						if (x == 2) {
							if (y == 2) {
								if (z == 3) {
									System.out.println("3月の地震の件数は" + quike[2] + "です。");
								}
							}
						}

						if (x == 2) {
							if (y == 2) {
								if (z == 4) {
									System.out.println("4月の地震の件数は" + quike[3] + "です。");
								}
							}
						}

						if (x == 2) {
							if (y == 2) {
								if (z == 5) {

									System.out.println("5月の地震の件数は" + quike[4] + "です。");
								}
							}
						}

						if (x == 2) {
							if (y == 2) {
								if (z == 6) {

									System.out.println("6月の地震の件数は" + quike[5] + "です。");
								}
							}
						}

						if (x == 2) {
							if (y == 2) {
								if (z == 7) {

									System.out.println("7月の地震の件数は" + quike[6] + "です。");
								}
							}
						}

						if (x == 2) {
							if (y == 2) {
								if (z == 8) {

									System.out.println("8月の地震の件数は" + quike[7] + "です。");
								}
							}
						}

						if (x == 2) {
							if (y == 2) {
								if (z == 9) {

									System.out.println("9月の地震の件数は" + quike[8] + "です。");
								}
							}
						}

						if (x == 2) {
							if (y == 2) {
								if (z == 10) {

									System.out.println("10月の地震の件数は" + quike[9] + "です。");
								}
							}
						}

					}
					if (x == 2) {
						if (y == 2) {
							if (z == 11) {

								System.out.println("11月の地震の件数は" + quike[10] + "です。");
							}
						}
					}

				}
				if (x == 2) {
					if (y == 2) {
						if (z == 12) {

							System.out.println("12月の地震の件数は" + quike[11] + "です。");
						}
					}
				}
				if (x == 3) {
					if (y == 2) {
						if (z == 1) {

							System.out.println("1月の降水量の件数は" + rain[0] + "です。");
						}
					}
				}

				if (x == 3) {
					if (y == 2) {
						if (z == 2) {

							System.out.println("2月の降水量の件数は" + rain[1] + "です。");
						}
					}
				}

				if (x == 3) {
					if (y == 2) {
						if (z == 3) {

							System.out.println("3月の降水量の件数は" + rain[2] + "です。");
						}
					}
				}

				if (x == 3) {
					if (y == 2) {
						if (z == 4) {

							System.out.println("4月の降水量の件数は" + rain[3] + "です。");
						}
					}
				}

				if (x == 3) {
					if (y == 2) {
						if (z == 5) {

							System.out.println("5月の降水量の件数は" + rain[4] + "です。");
						}
					}
				}

				if (x == 3) {
					if (y == 2) {
						if (z == 6) {

							System.out.println("6月の降水量の件数は" + rain[5] + "です。");
						}
					}
				}

				if (x == 3) {
					if (y == 2) {
						if (z == 7) {

							System.out.println("7月の降水量の件数は" + rain[6] + "です。");
						}
					}
				}

				if (x == 3) {
					if (y == 2) {
						if (z == 8) {

							System.out.println("8月の降水量の件数は" + rain[7] + "です。");
						}
					}
				}

				if (x == 3) {
					if (y == 2) {
						if (z == 9) {

							System.out.println("9月の降水量の件数は" + rain[8] + "です。");
						}
					}
				}

				if (x == 3) {
					if (y == 2) {
						if (z == 10) {

							System.out.println("10月の降水量の件数は" + rain[10] + "です。");
						}
					}
				}

				if (x == 3) {
					if (y == 2) {
						if (z == 11) {

							System.out.println("11月の降水量の件数は" + rain[10] + "です。");
						}
					}
				}

				if (x == 3) {
					if (y == 2) {
						if (z == 12) {
							System.out.println("12月の降水量の件数は" + rain[11] + "です。");
						}
					}
				}
			}
		}
	}
}
