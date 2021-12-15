public class BubbleSort {
	public static void main(String[] args) {
		int[] num = new int[10];
		for (int i = 0; i < 10; i++) {
			num[i] = (int) (Math.random() * 100);
			System.out.print(num[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < num.length - 1; i++)
			for (int j = 0; j < num.length - i - 1; j++) {
				if (num[j] > num[j + 1]) {
					int tmp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = tmp;
				}
			}
		System.out.println("After sort:");
		for (int i = 0; i < 10; i++)
			System.out.print(num[i] + " ");
	}
}