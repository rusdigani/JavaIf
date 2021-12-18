public class Nasi {
	public static void main (String[] args) {
		boolean nasi=true;
		int waktu=14;

		if (nasi==true) {
			if(waktu==3) {
				System.out.println("Nasi Matang Sempurna");
			}if (waktu<=2) {
				System.out.println("Nasi Belum Matang");
			}if (waktu>=4) {
				System.out.println("Nasi Setengah Matang");
			}if (waktu>=10) {
				System.out.println("Nasi Sudah Menjadi Bubur");
			}
		} else {
			System.out.println("Tidak ada kondisi ");
		}
	}

}