package com.company;

public class Shop  {
    class Product implements Runnable {
        private final String operation;
        private final Integer request;
        Product(String operation, Integer request) {
            this.operation = operation;
            this.request = request;
            run();
        }
        @Override
        public void run() {
            if (operation == "+") {
                step();
                product += this.request;
            }
            else {
                if (product < this.request){
                    System.out.println("No product");
                }
                else {
                    step();
                    product -= this.request;
                }
            }
        }
        private void step() {
            System.out.println("Product - "+product+". Operation "+operation+". Change on "+request);
        }

    }
    public Integer product = 0;
    Product people_manuf = new Product("+", (int) (Math.random() * 100));
    Product people_buyer = new Product("-", (int) (Math.random() * 100));
    public Shop() {
        new Thread(people_manuf).start();
        new Thread(people_buyer).start();
    }
}
