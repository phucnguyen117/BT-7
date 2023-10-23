package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//9.1
		int a,n,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so nguyen");
		a = sc.nextInt();
		if (a>0)
		System.out.println(a + "la so nguyen duong");
		if (a<0) {
		System.out.println(a + "la so nguyen am");
		}else {
			if (a==0)
			System.out.println(a + "ko phai so nguyen am va duong");
		}
		//9.2
		System.out.println("Nhap mot so nguyen");
		n = sc.nextInt();
			if (n % 3 == 0) {
			System.out.println(n+ "Chia het cho 3");
		}else {
		if (n % 5 == 0) {
			System.out.println(n + "Chia het cho 5");
		}else {
			System.out.println("ko chia het cho 3 va 5");
		}
		//9.3 
		System.out.println("Nhap Thang trong nam");
		b = sc.nextInt();
		if (b == 1 || b == 3 || b == 5 || b == 7 || b == 8 || b == 10 || b == 12) {
			System.out.println(b + "co 31 Ngay");
		}else {
		if (b == 4 || b == 6 || b == 9 || b ==11) {
			System.out.println(b + "co 30 ngay");
		}else {
		if (b == 2) {
			System.out.println(b + "co 28 ngay");
		}else {
			System.out.println("Nhap sai");
			}
		//9.4
			// Khai báo biến
			double e, r, c, x1, x2, del;
			// Nhập hệ số
			System.out.print("Nhập vào hệ số a = ");
			e = sc.nextDouble();
			System.out.print("Nhập vào hệ số b = ");
			r = sc.nextDouble();
			System.out.print("Nhập vào hệ số c = ");
			c = sc.nextDouble();

			// Giải và biện luận phương trình bậc 2
			if (e == 0) {
			    if (r == 0) {
				if (c == 0) {
				    System.out.println("Phương trình vô số nghiệm!");
				} else {
				    System.out.println("Phương trình vô nghiệm!");
				}
			    } else {
				System.out.println("Phương trình có nghiệm là: " + (-c / r));
			    }
			} else { // Trường hợp a != 0
			    // Tính giá trị delta
			    del = r * r - 4 * e * c;
			    if (del < 0) {
				System.out.println("Phương trình vô nghiệm!");
			    } else if (del == 0) {
				x1 = x2 = -b / (2 * e);
				System.out.println("Phương trình có nghiệm kép: " + x1);
			    } else {
				x1 = (-r + Math.sqrt(del)) / (2 * e);
				x2 = (-r - Math.sqrt(del)) / (2 * e);
				System.out.println("Phương trình có 2 nghiệm phân biệt là:\nx1 = " + x1 + "\nx2 = " + x2);
		}
			   //9.5
			    double j,k,l;
			    System.out.print("Nhập số a = ");
				j = sc.nextDouble();
				System.out.print("Nhập số b = ");
				k = sc.nextDouble();
				System.out.print("Nhập số c = ");
				l = sc.nextDouble();

				if ((j + k > l) || (j + l > k) || (k + l > j)) {
					System.out.println("Đây là tam giác !");
				}
				if ((j == k) || (k == l) || (l == j)) {
					System.out.println("Đây là tam giác cân !");
				} else if ((j == k) && (k == l) && (l == j)) {
					System.out.println("Đây là tam giác đều !");
				} else if ((j * j == k * k + l * l) || (k * k == j * j + l * l) || (l * l == k * k + j * j)) {
					System.out.println("Đây là tam giác vuông !");
				} else {
					System.out.println("Đây không phải tam giác");
				}
			}
		}
		}
		}
	}
}
