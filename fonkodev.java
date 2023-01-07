
import java.util.Random;
import java.util.Scanner;










/*
//girilen bnie sayı  asal  olub olmadı yazdıran program
public class fonkodev {
    public static void asalmı(int a){
        int sayac=0;
        for(int i=2;i<a;i++){
            if(a%i==0){
                sayac+=1;
            }
            
        }
        if(sayac==0){
            System.out.println("girdiniz sayı asaldır");
        }
        else {
            System.out.println("girdiniz sayı asal değildir");
        }
                
        
        
        
       
        
    }
    public static void nkare(int a){
        int toplam=0;
        for(int i=0;i<a;i++){
            System.out.println(i*i);
            toplam+=i*i;
        }
        System.out.println("sayılarımn toplamı"+toplam);
    }

  
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen asal kontrol etmek istediniz sayı giriniz:");
        int a=scanner.nextInt();
        asalmı(a);
        System.out.println("lütfen n ust sınırı giriniz: ");
        int n=scanner.nextInt();
        nkare(n);
                
        
       
    }
    
}
*/

//bir dizi ici kucukten buyuğe sıralayan program metotla

/*
public class fonkodev{
    public static int[] dizi_siralama(int b){
       int[] a=new int[b];
        Random r=new Random();
        for(int i=0;i<a.length;i++){
            a[i]=r.nextInt(100);
        }
        
        for(int i=0;i<a.length;i++){
            int gec;
            for(int k=0;k<a.length;k++){
                if(a[i]<a[k]){
                    gec=a[i];
                    a[i]=a[k];
                    a[k]=gec;
                }
      
                
            }
       
        }
        return a;
     
    }

           
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("sizi uzunlugu giriniz: ");
        int uzun =scanner.nextInt();
        System.out.println("lütfen sutun sayısı giriniz: ");
        int sut=scanner.nextInt();
        
        int[] dizi1=dizi_siralama(uzun);
        
        for(int i=0;i<uzun;i++){
            System.out.println(dizi1[i]);
            
        }
        
                
        
    }
}
*/
//iki boyutlu dizi 0 ust sınıra kadar rastegele değer dondurme 
/*
public class fonkodev{
    public static int[][] iki_boutlu_dizi(int a,int b){
        Random r=new Random();
        int[][] dizi=new int[a][b];
        
        for(int i=0;i<a;i++){
            for(int k=0;k<b;k++){
                dizi[i][k]=r.nextInt(50);
            }
        }
        return dizi;
        
    }
    
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen satır sayısını giriniz: ");
        int satır=scanner.nextInt();
        System.out.println("lütfen sutun sayısını giriniz:  ");
        int sut=scanner.nextInt();
        int[][] dizi1=iki_boutlu_dizi(satır,sut );
        for(int i=0;i<satır;i++){
            for(int k=0;k<sut;k++){
                System.out.print(dizi1[i][k]+" ");
                
            }
            System.out.println("");
        }
        
       
        
                 
        
    }
}
*/
//iki ayrı ayrı dizinin toplamı  yeni diziye atama
/*

public class fonkodev{

    public static int [][] dizi_toplama(int [][] a,int [][] b ){
        int [][] c=new int[a.length][b.length];
        for(int i=0;i<a.length;i++){
            for(int k=0;k<b.length;k++){
                c[i][k]=a[i][k]+b[i][k];
            }
        }
        return c;
        
    }
    
    
    public static int [][] dizi1(int a,int b){
        int [][] c=new int[a][b];
        Random r=new Random();
        for(int i=0;i<a;i++){
            for(int k=0;k<b;k++){
                c[i][k]=r.nextInt(50);
            }
        }
        return c;
        
        
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("uzunuluk /genişlek");
        int a=scanner.nextInt();
        int dizi[][]=dizi1(a, a);
        int dizi1[][]=dizi1(a, a);
        int [][] toplam=dizi_toplama(dizi, dizi1);
        System.out.println("dizi 1:");
        for(int i=0;i<a;i++){
            for(int k=0;k<a;k++){
                System.out.print(dizi[i][k]+" ");
            }
            System.out.println("");
        }
        System.out.println("dizi2: ");
        for(int i=0;i<a;i++){
            for(int k=0;k<a;k++){
                System.out.print(dizi1[i][k]+" ");
            }
            System.out.println("");
        }
      
        System.out.println("");
        System.out.println("toplamı: ");
        for(int i=0;i<a;i++){
            for(int k=0;k<a;k++){
                System.out.print(toplam[i][k]+" ");
            }
            System.out.println(" ");
        }
        
        
    }
    
    
    
    
}
*/
//dışsardan girilen n değere kadar cizilen ucgen
/*

public class fonkodev{
    public static void yıldız(int a){
        String islemler ="artan şekilde dizi icin lütfen 1 tuşlayınız:\n"+
                "azalan şekilde yazdırmak icin lütfen 2 tuşlayınız\n "+
                "sistemden cıkamk icin  lütfen 0 basınız";
        System.out.println("**************************");
        System.out.println(islemler);
        Scanner scanner =new Scanner(System.in);
        
        while (true) {
            System.out.println("lütfen islem giriniz:");
            int islm=scanner.nextInt();
            
            if(islm==0){
                System.out.println("cıkış yapılyor....");
                break;
            }
            
            else if(islm==1){
                 for(int i=0;i<=a;i++){
            for(int  k=0;k<i;k++){
                System.out.print("*");
            }
            System.out.println(" ");
            
            }
      
         }
            else if(islm==2){
                for(int i=a;i>0;i--){
                    for(int k=0;k<i;k++){
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
            }
          
         
        
        
        
       
    }
    }
    
    
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen n değeri giriniz");
        
        int n=scanner.nextInt();
        yıldız(n);
        
    }
}
*/

