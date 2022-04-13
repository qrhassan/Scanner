
import java.util.Scanner;

	public class ScannerHW {

		public static void main(String[] args) {
		
			Scanner scan = new Scanner (System.in);
			
			System.out.println("Enter the product name");
			String LED = scan.nextLine();
			System.out.println("Enter LED quantity");
			int LED1 = scan.nextInt();
			System.out.println("Enter LED price");
			double LED2 = scan.nextDouble();
			double LEDPrice = LED1*LED2;
			scan.nextLine();
			
			System.out.println("Enter the product name");
			String RUG = scan.nextLine();
			System.out.println("Enter RUG quantity");
			int RUG1 = scan.nextInt();
			System.out.println("Enter RUG price");
			double RUG2 = scan.nextDouble();
			double RUGPrice = RUG1*RUG2;
			scan.nextLine();
			
			System.out.println("Enter the product name");
			String CHAIR = scan.nextLine();
			System.out.println("Enter CHAIR quantity");
			int CHAIR1 = scan.nextInt();
			System.out.println("Enter CHAIR price");
			double CHAIR2 = scan.nextDouble();
			double CHAIRPrice = CHAIR1*CHAIR2;
			scan.nextLine();
			
			System.out.println("Enter the product name");
			String PLATE = scan.nextLine();
			System.out.println("Enter PLATE quantity");
			int PLATE1 = scan.nextInt();
			System.out.println("Enter PLATE price");
			double PLATE2 = scan.nextDouble();
			double PLATEPrice = PLATE1*PLATE2;
			
			float salesTAX = 0.07f;
			double nettotal = LEDPrice + RUGPrice + CHAIRPrice + PLATEPrice;
			double roundoff1 = Math.round(nettotal*100.0)/100.0;
			double TAX = salesTAX * nettotal;
			double roundoff2 = Math.round(TAX*100.0)/100.0; 
			double Total = nettotal + (salesTAX * nettotal);
			double roundoff3 = Math.round(Total*100.0)/100.0;
			
			System.out.println("\t"+ "\t" + "IKEA" + "\t"+ "\t");	
			System.out.println("Welcome to IKEA Woodbridge!");
			System.out.println("Open Mon-Sat 10am-9pm & Sun. 10am-7pm");
			System.out.println("----------------------------------------");
			System.out.println("Visit us at www.IKEA.com");
			System.out.println("Open Mon-Sat 10am-9pm & Sun. 10am-7pm");
			System.out.println("IKEA Family" + "\t" + "6275890xxxxxxxx0176");
		
			System.out.println("Article 00440787" + "\t" + "17796");
			System.out.println("Upplyst LED w1" + "\t" + LEDPrice);
			System.out.println("Langsted RUG" + "\t" + RUGPrice);
			System.out.println("Micro Chair" + "\t" + CHAIRPrice);
			System.out.println("Canto Plate" + "\t" + PLATEPrice);
			
			System.out.println("		..............			" );
			System.out.println("Net Total" + "\t"+ roundoff1);
			System.out.println("TAX" + "\t"+"\t" + roundoff3);
			
			System.out.println("		..............			" );
			System.out.println("Total" + "\t"+"\t" + roundoff3);
			
			System.out.println("Total Articles" +"\t"+"4");
			
			System.out.println("EFT VISA USD$"+"\t"+ roundoff3);
			System.out.println("-----------Transaction Record-----------");
			//System.out.println("----------------------------------------");
			System.out.println("STORE"+"\t"+"\t"+"# 168"+"\t"+"REG # 171");
			System.out.println("INVOICE"+"\t"+"\t"+"# 38555989633354689");
			System.out.println("MERCHANT"+"\t"+"# **********8995");
			System.out.println("INVOICE"+"\t"+"	# ******89558");
			System.out.println("----------------------------------------");
			System.out.println("TYPE: " +"\t"+"sale");
			System.out.println("ACCI"+"\t"+"VISA INSER \n VISA CREDIT");
			System.out.println("----------------------------------------");
			System.out.println("RECEIPTS REQUIRED FOR RETURNS/EXCHANGES");
			System.out.println("----------------------------------------");
			System.out.println("\t"+"LAST VALID RETURN DATE IS:\n" + "\t"+"\t"+"04/04/2023" );
			System.out.println("----------------------------------------");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("\t"+"\t"+"\t"+"Customere copy");
			System.out.println("\t"+"\t"+"\t"+"04/04/2022");
	}

}
