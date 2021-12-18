public class SkorUjian {
	public static void main(String[] args) {
		int skorujian= 86; char nilai;
		String keterangan;

		if (skorujian >= 90) {
			nilai = 'A';
			keterangan = "Lulus";
		} else if (skorujian >= 80) {
			nilai = 'B';
			keterangan = "Lulus";
		} else if (skorujian >= 70) {
			nilai = 'C';
			keterangan = "Lulus";
		} else  {
			nilai = 'D';
			keterangan = "Tidak Lulus";
		}
		System.out.println("Nilai = " + nilai);
		System.out.println("Keterangan = " + keterangan);
		{
		}
	}
}
