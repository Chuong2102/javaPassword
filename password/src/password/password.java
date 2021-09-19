package password;
import java.util.Scanner;
public class password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String USERNAMELOGIN = "u";
		final String PASSWORDLOGIN = "p";
		
		Scanner input = new Scanner(System.in);
		
		String username, password;
		System.out.println("Nhap USERNAME");
		username = input.next();
		System.out.println("Nhap PASSWORD");
		password = input.next();
		
		if(username.compareTo(USERNAMELOGIN) == 0 && password.compareTo(PASSWORDLOGIN) == 0) {
			System.out.println("Dang nhap thanh cong");
		}
		else
		{
			System.out.println("Sai ten dang nhap hoac mat khau");
		}
	}

}
