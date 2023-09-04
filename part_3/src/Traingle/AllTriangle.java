package Traingle;

import java.util.Scanner;

public class AllTriangle {

	public static void main(String[] args) {
		boolean flag=true;
		while(flag) {
		System.out.println("\n\n Enter your choice :");
		System.out.println();
		System.out.println("1-Right Down Triangle Hollow\n"+"2-Right Down Triangle\n"+"3-Right Pyramid Hollow\n"+"4-Right Pyramid\n"+"5-Right Upper Triangle Hollow\n"+"6-Right Upper Triangle\n"+"7-Inverted Pyramid Hollow\n"+"8-Inverted Pyramid\n"+"9-Left Down Hollow\n"+"10-Left Down Triangle\n"+"11-Left Pyramid Hollow\n"+"12-Left Pyramid\n"+"13-Lower Left Traingle\n"+"14-Lower Left Traingle Hollow\n"+"15-Pyramid Hollow\n"+"16-Pyramid\n"+"17-Exit");
        
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		
		switch (i) {
		case 1:{
			AllTriangle.RightDownTri_H();
		}
		break;
		case 2:{
			AllTriangle.RightDownTri();;
		}
		break;
		case 3:{
			AllTriangle.RightPyramid_H();;
		}
		break;
		case 4:{
			AllTriangle.RightPyramid();
		}
		break;
		case 5:{
			AllTriangle.RightUppertri_H();;
		}
		break;
		case 6:{
			AllTriangle.RightUpperTriangle();
		}
		break;
		case 7:{
			AllTriangle.InvertedPyramid_H();
		}
		break;
		case 8:{
			AllTriangle.InvertedPyramid();
		}
		break;
		case 9:{
			AllTriangle.LeftDown_H();
		}
		break;
		case 10:{
			AllTriangle.LeftDownTriangle();
		}
		break;
		case 11:{
			AllTriangle.LeftPyramid_H();
		}
		break;
		case 12:{
			AllTriangle.LeftPyramid();
		}
		break;
		case 13:{
			AllTriangle.LowerLeftTra();
		}
		break;
		case 14:{
			AllTriangle.LeftDown_H();
		}
		break;
		case 15:{
			AllTriangle.Pyramid_H();
		}
		break;
		case 16:{
			AllTriangle.Pyramid();
		}
		break;
		case 17:{
		   flag=false;
		   System.out.println("\n  Thank you \n Visit Again");
		}
			break;
		}
	}
	}
	
	public static void RightDownTri_H() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int i=s.nextInt();
	for (int row = 1; row <=i; row++) {
		for (int col = 1; col<=i; col++) {
			if (row==1 || col==i || row==col) {
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	}
	
	public static void RightDownTri() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int i=s.nextInt();
	for (int row = 1; row <=i; row++) {
		for (int col = 1; col<=i; col++) {
			if (row<=col) {
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	}
	
	public static void RightPyramid_H() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int i=s.nextInt();
		for (int row = 1; row <=2*i-1; row++) {
			for (int col = 1; col <=i; col++) {
				if (col==i || col+row==i+1 || row-col==i-1) {
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
		
		public static void RightPyramid() {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the size");
			int i=s.nextInt();
			for (int row = 1; row <=2*i-1; row++) {
				for (int col = 1; col <=i; col++) {
					if (row-col<=i-1 && row+col>=i+1) {
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}
			
			public static void RightUppertri_H() {
				Scanner s=new Scanner(System.in);
				System.out.println("Enter the size");
				int i=s.nextInt();
				for (int row = 1; row <=i; row++) {
					for (int col = 1; col <=i; col++) {
						if (row==i || col==i || row+col==i+1) {
							System.out.print("* ");
						}
						else
						{
							System.out.print("  ");
						}
					}
					System.out.println();
		}}
			
				public static void RightUpperTriangle() {
					Scanner s=new Scanner(System.in);
					System.out.println("Enter the size");
					int i=s.nextInt();
					for (int row = 1; row <=i; row++) {
						for (int col = 1; col <=i; col++) {
							if (row+col>=i+1) {
								System.out.print("* ");
							}
							else
							{
								System.out.print("  ");
							}
						}
						System.out.println();
					}
				}
				
				
				public static void InvertedPyramid_H() {
					Scanner s=new Scanner(System.in);
					System.out.println("Enter the size");
					int i=s.nextInt();
					for (int row = 1; row <=i; row++) {
						for (int col = 1; col <=2*i-1; col++) {
							if (row==1 || row==col || row+col==2*i) {
								System.out.print("* ");
							}
							else
							{
								System.out.print("  ");
							}
						}
						System.out.println();
					}

				}
				public static void InvertedPyramid() {
					Scanner s=new Scanner(System.in);
					System.out.println("Enter the size");
					int i=s.nextInt();
					for (int row = 1; row <=i; row++) {
						for (int col = 1; col <=2*i-1; col++) {
							if (row<=col && row+col<=2*i) {
								System.out.print("* ");
							}
							else
							{
								System.out.print("  ");
							}
						}
						System.out.println();
					}}

					public static void LeftDown_H() {
						  Scanner s=new Scanner(System.in);
							System.out.println("Enter the size");
							int i=s.nextInt();
						for (int row = 1; row <=i; row++) {
							for (int col = 1; col <=i; col++) {
								if (row+col==i+1 || row==1 || col==1) {
									System.out.print("* ");
								}
								else
								{
									System.out.print("  ");
								}
							}
							System.out.println();
						}
					}
						public static void LeftDownTriangle() {
							   Scanner s=new Scanner(System.in);
								System.out.println("Enter the size");
								int i=s.nextInt();
							for (int row = 1; row <=i; row++) {
								for (int col = 1; col <=i; col++) {
									if (row+col<=i+1) {
										System.out.print("* ");
									}
									else
									{
										System.out.print("  ");
									}
								}
								System.out.println();
							}
						}
							public static void LeftPyramid_H() {
								Scanner s=new Scanner(System.in);
								System.out.println("Enter the size");
								int i=s.nextInt();
								for (int row = 1; row <=2*i-1; row++) {
									for (int col = 1; col <=i; col++) {
										if (col==1 || row==col || row+col==2*i) {
											System.out.print("* ");
										}
										else
										{
											System.out.print("  ");
										}
									}
									System.out.println();
								}
							}
								public static void LeftPyramid() {
									Scanner s=new Scanner(System.in);
									System.out.println("Enter the size");
									int i=s.nextInt();
									for (int row = 1; row <=2*i-1; row++) {
										for (int col = 1; col <=i; col++) {
											if (row>=col && row+col<=2*i) {
												System.out.print("* ");
											}
											else
											{
												System.out.print("  ");
											}
										}
										System.out.println();
									}
								}
									public static void LowerLeftTra() {
										Scanner s=new Scanner(System.in);
										System.out.println("Enter the size");
										int i=s.nextInt();
										for (int row = 1; row <=i; row++) {
											for (int col = 1; col <=i; col++) {
												if (row>=col) {
													System.out.print("* ");
												}
												else
												{
													System.out.print("  ");
												}
											}
											System.out.println();
										}
									}
										public static void LowerLeftTri_H() {
											Scanner s=new Scanner(System.in);
											System.out.println("Enter the size");
											int i=s.nextInt();
											for (int row = 1; row <=i; row++) {
												for (int col = 1; col <=i; col++) {
													if (row==1 || col==1 || row+col==i+1) {
														System.out.print("* ");
													}
													else
													{
														System.out.print("  ");
													}
												}
												System.out.println();
											}
										}
		public static void Pyramid_H() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int i=s.nextInt();
		for (int row = 1; row <=i; row++) {
			for (int col = 1; col <=2*i-1; col++) {
				if (row==i || row+col==i+1 || col-row==i-1) {
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		}
		
		public static void Pyramid() {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the size");
			int i=s.nextInt();
			for (int row = 1; row <=i; row++) {
				for (int col = 1; col <=2*i-1; col++) {
					if (row+col>=i+1 && col-row<=i-1 ) {
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				System.out.println();
			}

		}
}
