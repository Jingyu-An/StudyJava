package ch11;

public class MakeReport {

    StringBuffer buffer = new StringBuffer();

    private String line = "==================================\n";
    private String title = "Name\t Address \t PhoneNumber  \n";

    private void makeHeader() {

        buffer.append(line);
        buffer.append(title);
        buffer.append(line);
    }

    private void generateBody(){

        buffer.append("James \t");
        buffer.append("Montreal \t");
        buffer.append("434-444-4444\n");
    }

    private void makeFooter() {

        buffer.append(line);
    }

    public String getReport() {

        makeHeader();
        generateBody();
        makeFooter();
        return buffer.toString();
    }
}
