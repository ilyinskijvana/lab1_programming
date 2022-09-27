class lab1{
    public static void main(String[] args){
int n=8;
        int b=16;
        int[] a = new int[n];
        for(int i=0; i < n; i++){
            a[i]=b;
            b=b-2;
  }
        int m=11;
        double[]x =new double[m];
        for (int j=0; j < m; j++){
        double c = Math.random()*23 - 13;
        x[j]=c;
                }
		double [][] mas = new double[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
         if (a[i]==4){mas[i][j]=Math.cos(Math.log(2/(2+Math.abs(x[j])))); }
         else if(a[i]==8 || a[i]==10 || a[i]==14 || a[i]==16){mas[i][j]=Math.atan(Math.sin(((Math.pow(((Math.atan((x[j]-2)/22)-0.25)/Math.cbrt(3)), 2)))));}
         else{mas[i][j]=Math.pow((Math.pow((3*(Math.pow((Math.sin(x[j])),(2*Math.pow(Math.E,x[j]))-1))),2)),(( Math.PI-Math.cbrt(Math.sin(Math.pow((x[j]),(2*(3+x[j]))))))/2/3*Math.tan(Math.asin((x[j]-2)/22))));}
         System.out.printf("%.2f", mas[i][j]);
         System.out.print(" ");
            }
            System.out.println("");
        }
        }
}