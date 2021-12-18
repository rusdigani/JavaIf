public class Sepatu {
	public static void main (String[] args) {
		boolean memakai=false;
		int waktu=8;
		
		if(memakai==false) {
			if (waktu>=10) {
				System.out.println("JIka tidak bersih maka tidak dipakai");
				System.out.println("dibuang");
			}else {
				System.out.println("Jika bersih maka di pakai");
			}
		} else {
			System.out.println("Tidak memakai sama sekali");
		}
	}

}