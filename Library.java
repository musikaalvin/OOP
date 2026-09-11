class Library {
    void open() {
        System.out.println("Library is open");
    }
}

class Book extends Library {
    void borrow() {
        System.out.println("Book borrowed");
    }
}