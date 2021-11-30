/*
 * Made by:Bernardus Hersa Galih Prakoso
 * Informatika Sanata Dharma 215314018
 */

package com.tugas.pptarray;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class pptArray {
    
    /**
     * program mengurutkan array dari nilai paling kecil hingga paling besar
     * @param List 
     */
    static void bubbleSort(int List[]){
        int temp; //deklarasi variabel int bernama temp
        int size=List.length; //deklarasi variabel int bernama size. Assignment
                              //dgn nilai panjang array List
        for(int i=0;i<size-1;i++){ //kondisi awal i=0. lakukan loop selama
                                   //i<variabel size-i. lakukan i++ sblm iterasi
                                   //berikut
            for(int j=0;j<size-(i+1);j++){ //kondisi awal j=0. lakukan loop selama
                                           //j<variabel size-(i+1). lakukan i++
                                           //sebelum iterasi berikutnya
                if(List[j]>List[j+1]){ //jika nilai array List pada posisi j
                                       //lebih dari nilai array List pada posisi
                                       //j+1
                   temp=List[j];       //assign nilai array List di posisi j
                                       //pada variabel temp
                    List[j]=List[j+1]; //assign nilai array List di posisi j+1
                                       //pada array List di posisi j
                    List[j+1]=temp;    // assign nilai variabel temp pada array
                                       //List di posisi j+1
                }                
            }
        }System.out.println(Arrays.toString(List));
    }
    
    static void lengthArray(){
        int[] nilai; //deklarasi variabel int array dengan nama nilai
        Scanner keyboard=new Scanner(System.in); //Pembuatan objek scanner bernama
                                                 //keyboard
        System.out.print("Masukkan jumlah elemen array:"); //cetak string
        int n=keyboard.nextInt(); //deklarasi variabel int bernama n. assign nilai
                                  //menggunakan objek keyboard dgn method nextInt
        nilai=new int[n];         //Pembuatan objek int array dengan besar n
                                  //bernama nilai
        
        System.out.println("Masukkan "+n+" nilai: "); //cetak string
        for(int i=0;i<nilai.length;i++){ //kondisi awal i=0. lakukan loop selama
                                         //i<panjang array nilai. lakukan i++
                                         //sebelum iterasi berikutnya
            nilai[i]=keyboard.nextInt(); //assign nilai pada array nilai di posisi
                                         //i menggunakan objek keyboard dengan 
                                         //method nextint()
        }
        System.out.println();   //cetak new line
        System.out.println("Isi array nilai dari akhir ke awal:"); //cetak string
        for(int i=0;i<nilai.length;i++){ //kondisi awal i=0. lakukan loop selama 
                                         //i<panjang array nilai. lakukan i++
                                         //sebelum iterasi berikutnya
            System.out.println(nilai[nilai.length-(i+1)]);//cetak array nilai pada
                                            //posisi panjang array nilai dikurangi
                                            //(i+1)
        }
    }
    
    static void kesamaanArray(){
        int[] lama, baru;//deklarasi variabel int array bernama lama dan baru
        lama=new int[5]; //buat objek int dengan besar 5 dengan nama lama
        
        Scanner Keyboard=new Scanner(System.in); //buat objek scanner bernama Keyboard
        System.out.println("Masukkan 5 nomor: "); //cetak string
        for(int i=0;i<5;i++)lama[i]=Keyboard.nextInt(); //kondisi awal i=0. lakukan loop
                                               //selama i<5. lakukan i++ sebelum
                                               //iterasi berikutnya.
                                               //assign nilai pada objek lama di
                                               //posisi i menggunakan objek keyboard
                                               //dengan method nextint()
        
        baru=lama; //assign nilai pada variabel baru menggunakan nilai variabel lama
        System.out.println("");//cetak new line
        System.out.println("Isi Array lama dari akhir ke awal:");//cetak string
        for(int i=0;i<5;i++) System.out.println(lama[4-i]);//kondisi awal i=0. lakukan loop
                                               //selama i<5. lakukan i++ sebelum
                                               //iterasi berikutnya.
                                               //cetak array lama pada posisi 4-i
        
        System.out.println("Isi array baru dari akhir ke awal:"); //cetak string
        for(int i=0;i<5;i++) System.out.println(baru[4-i]); //kondisi awal i=0. lakukan loop
                                               //selama i<5. lakukan i++ sebelum
                                               //iterasi berikutnya.
                                               //cetak array baru pada posisi 4-i
    }
    
    static void isiArray(){
        int[] nilai=new int[5]; //deklarasi variabel int array bernama nilai
                                //buat objek int array sebesar 5 bernama nilai
        Scanner keyboard=new Scanner(System.in);//buat objek scanner bernama keyboard
        
        System.out.println("Masukkan 5 angka bulat: '"); //cetak string
        
        for(int i=0;i<5;i++) nilai[i]=keyboard.nextInt(); //kondisi awal i=0. lakukan loop
                                               //selama i<5. lakukan i++ sebelum
                                               //iterasi berikutnya.
                                               //assign nilai pada array nilai di
                                               //posisi i menggunakan objek keyboard
                                               //dengan method nextInt
        
        System.out.println(""); //cetak new line
        
        System.out.println("Cetak isi array dari akhir ke awal: "); //cetak string
        
        for(int i=0;i<5;i++) System.out.println(nilai[4-i]);//kondisi awal i=0. lakukan loop
                                               //selama i<5. lakukan i++ sebelum
                                               //iterasi berikutnya.
                                               //cetak array nilai pada posisi 4-i
    }
    
    static void minMax(int arr[]){
        int min=arr[0], max=arr[0]; //assign nilai variabel min dan max
                                    //menggunakan nilai arr pada posisi 0
        for(int i=1;i<arr.length;i++){ //kondisi awal i=0. lakukan loop
                                       //selama i<panjang arr. lakukan i++ sebelum
                                       //iterasi berikutnya.           
           
            if(arr[i]<min){ //jika arr di posisi i kurang dari min
                min=min(arr[i]); //assign nilai arr pada posisi i pada variabel min
            }else if(arr[i]>max){ //jika arr di posisi i lebih dari max
                max=max(arr[i]); //assign nilai arr di posisi i pada variabel max
            }
        }
        System.out.println("min= "+min+" max= "+max);
    }
           
    static int max(int x){
        int maximum=x;
        return maximum;
    }
    
    static int min(int x){
        int minimum=x;
        return minimum;
    }
    
    
    public static void check() {
       
    
    int max = 0, min = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Masukkan " + n + " nilai : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            if (i == 0) {
                max = a[0];
                min = a[0];
            }
            else{
            min=min1(min, a[i]);
            max=max1(max, a[i]);}

        }
        System.out.println("Nilai max : " + max);
        System.out.println("Nilai min : " + min);
    }
    
    static int max1(int i,int x){
        if (x > i) {
                i = x;
            }
        return i;
    }
    
    static int min1(int min, int x){
        if (x < min) {
                min = x;
            }
        return min;
    }

    /*@param args the command line arguments*/
    public static void main(String[] args) {
        int[] arr={2,5,9,2,4,9,1,10,4};
        int i=arr[2];
        bubbleSort(arr);
        
    }

}
