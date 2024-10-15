package lesson_24.interfaces;

public class Application {
    public static void main(String[] args) {

        Book book = new Book("Master", "Borat");
        book.print();

        Printable book1 = new Book("Java", "Mr. Bin");
        book1.print();
        Journal journal = new Journal("Play Boy", 254);
        journal.print();

        Printable printable = journal;
        printable.print();

        book.test();

        Presentation presentation = new Presentation("Her",
                "Fockers",
                "About nothings",
                20);
        presentation.print();

        ColorPrintable colorPrintable = presentation;
        colorPrintable.colorPrint();

    }
}
