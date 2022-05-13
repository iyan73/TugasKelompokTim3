import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.io.IOException;

public class Kasir {
    private static BufferedReader br = null;
    public static void main(String[] args) {
        boolean inputAgain = true;
        String chooseInputAgain = "";
        String inputUpdateBarang = "";
        Scanner keyboard = new Scanner(System.in);
        int selectedProduct;
        int totalSelectedProduct;
        int totalAmount;
        ArrayList<Integer> ids = new ArrayList<>();
        Product resultSelectedProduct;
        ArrayList<Cart> listSelectedProduct = new ArrayList<>();
        ArrayList<Product> listProduct = new ArrayList<>();
        listProduct.add(new Product(1, "Minyak Goreng ", 25000));
        listProduct.add(new Product(2, "Es Krim       ", 15000));
        listProduct.add(new Product(3, "Parfum        ", 30000));
        listProduct.add(new Product(4, "Masako 1 Lusin", 10000));
        listProduct.add(new Product(5, "Kopi ABC      ", 10000));
        listProduct.add(new Product(6, "Permen 1 Bks  ", 10000));
        listProduct.add(new Product(7, "Kecap Manis   ", 12000));
        listProduct.add(new Product(8, "Saos Botol    ", 12000));
        listProduct.add(new Product(9, "Telur         ", 15000));


        System.out.println("Daftar Produk Toko Kelontong Muda Berkarya");
        System.out.println("------------------------------------------");
        for (int i = 0; i <= listProduct.toArray().length -1; i++){
            System.out.println(listProduct.get(i).productId + ". " + listProduct.get(i).name);
        }
        System.out.println("------------------------------------------");

        while (inputAgain) {
            br = new BufferedReader(new InputStreamReader(System.in));
            try {
                System.out.print("Pilih Nomor Produk Yang Akan Di Jual:   ");
                selectedProduct = keyboard.nextInt();
                System.out.print("Masukkan jumlah barang:   ");
                totalSelectedProduct = keyboard.nextInt();
                System.out.println("cek:   "+ ids.contains(selectedProduct));
                if (ids.contains(selectedProduct) == false){
                    ids.add(selectedProduct);
                    resultSelectedProduct = listProduct.get(selectedProduct - 1);
                    listSelectedProduct.add(new Cart(resultSelectedProduct.productId, resultSelectedProduct.name, resultSelectedProduct.price, totalSelectedProduct));
                }else{
                    System.out.println("Barang sudah ada di keranjang!!!");
                    System.out.println("tambahkan jumlah barang sebelumnya atau perbarui jumlah barang?");
                    System.out.println("[t = tambah/ p = perbarui]");
                    inputUpdateBarang = br.readLine();
                    if (inputUpdateBarang.equalsIgnoreCase("t")){
                        int finalSelectedProduct = selectedProduct;
                        int finalTotalSelectedProduct = totalSelectedProduct;
                        listSelectedProduct.forEach(x -> {
                            if (x.productId == finalSelectedProduct){
                                x.qty += finalTotalSelectedProduct;
                            }
                        });
                    }else if (inputUpdateBarang.equalsIgnoreCase("p")){
                        int finalSelectedProduct = selectedProduct;
                        int finalTotalSelectedProduct = totalSelectedProduct;
                        listSelectedProduct.forEach(x -> {
                            if (x.productId == finalSelectedProduct){
                                x.qty = finalTotalSelectedProduct;
                            }
                        });
                    }
                }

                System.out.println("Tambah Barang Lagi? [y/t]:");

                chooseInputAgain = br.readLine();
                if (chooseInputAgain.equalsIgnoreCase("t")) {
                    totalAmount = 0;
                    System.out.println("******************** Nota Belanja ********************");
                    System.out.println("No" + ". " + "Nama Barang" + "     " + "Qty" + "     " + "Price" + "     " + "amount");
                    for (int i = 0; i <= listSelectedProduct.toArray().length - 1; i++ ){
                        System.out.println((i+1) + ". " + listSelectedProduct.get(i).name + "     " + listSelectedProduct.get(i).qty + "     " + listSelectedProduct.get(i).price + "     " + listSelectedProduct.get(i).qty * listSelectedProduct.get(i).price);
                        totalAmount =+ (listSelectedProduct.get(i).qty * listSelectedProduct.get(i).price);
                    }
                    System.out.println("==================================================");
                    System.out.println("                                "+"Total : " + totalAmount);
                    inputAgain = false;
                }
                else if (chooseInputAgain.equalsIgnoreCase("y")) {
                    inputAgain = true;
                } else {
                    System.exit(0);
                }
            }catch (IOException ioe) {
                System.out.println("Error IOException");
            }
        }
    }
}

class Product {
    int productId;
    String name;
    int price;

    Product(int id, String n, int p) {
        productId = id;
        name = n;
        price = p;
    }
}

class Cart {
    int productId;
    String name;
    int price;
    int qty;

    Cart(int id, String n, int p, int q) {
        productId = id;
        name = n;
        price = p;
        qty = q;
    }
}
