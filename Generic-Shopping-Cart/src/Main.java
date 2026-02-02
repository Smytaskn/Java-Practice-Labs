public class Main {
    public static void main(String[] args) {
        // 1. Ürünleri Oluştur
        FoodProduct elma = new FoodProduct("Elma", 15.50, 10);
        FoodProduct ekmek = new FoodProduct("Ekmek", 10.00, 10);

        // 2. Sepeti Oluştur (Sadece StoreItem türevlerini kabul eder)
        ShoppingCart<FoodProduct> sepet = new ShoppingCart<>();

        // 3. Sepete Ekle
        sepet.addItem(elma);
        sepet.addItem(ekmek);

        // 4. Toplam Tutarı Hesapla
        System.out.println("Sepetinizdeki Urunler:");
        for (FoodProduct p : sepet.getItems()) {
            System.out.println("- " + p.toString());
        }

        System.out.println("Toplam Tutar: " + sepet.calculateTotalPrice() + " TL");
    }
}