
  System.out.println("Enter the row:");
    Scanner sc=new Scanner(System.in);
    int row=sc.nextInt();

    System.out.println("Enter the col:");
    int col=sc.nextInt();


    for(int i=1; i<=row; i++){
        for(int j=1; j<=col; j++){
            System.out.print(" "+j);
        }
        System.out.println();
    }
