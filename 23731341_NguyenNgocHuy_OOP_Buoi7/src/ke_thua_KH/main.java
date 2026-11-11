
package ke_thua_KH;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {

        KhachHangVietNam kh1 = new KhachHangVietNam(
                "KH01", "Nguyen An",
                LocalDate.of(2026, 10, 9),
                150, 2000,
                "Sinh hoat", 100
        );

        KhachHangNuocNgoai kh2 = new KhachHangNuocNgoai(
                "KH02", "John",
                LocalDate.of(2026, 10, 9),
                150, 3000,
                "My"
        );

        KhachHangNuocNgoai kh3 = new KhachHangNuocNgoai(
        		"KH03", "Sam",
        		LocalDate.of(2026, 10, 9),
        		150, 5000,
        		"Anh"
        		);
        

        KhachHang[] ds = {kh1, kh2, kh3};

        for (KhachHang kh : ds) {
        	if (kh instanceof KhachHangVietNam) {
        		System.out.println("Khach hang Viet Nam:");
        	} else if (kh instanceof KhachHangNuocNgoai) {
        		System.out.println("Khach hang nuoc ngoai:");
        	}

        	System.out.println(kh);
        	System.out.println();
}
        
        
    }
}