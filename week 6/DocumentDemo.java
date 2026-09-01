interface Confidential {
}

class PublicDocument {
    String name;

    PublicDocument(String name) {
        this.name = name;
    }
}

class ConfidentialDocument implements Confidential {
    String name;

    ConfidentialDocument(String name) {
        this.name = name;
    }
}

public class DocumentDemo {
    public static void main(String[] args) {

        Object[] documents = new Object[4];

        documents[0] = new PublicDocument("College Notice");
        documents[1] = new ConfidentialDocument("Salary Details");
        documents[2] = new PublicDocument("Event Schedule");
        documents[3] = new ConfidentialDocument("Student Records");

        for (int i = 0; i < documents.length; i++) {

            if (documents[i] instanceof Confidential) {
                ConfidentialDocument doc =
                        (ConfidentialDocument) documents[i];

                System.out.println(doc.name + " - Confidential");
            } else {
                PublicDocument doc =
                        (PublicDocument) documents[i];

                System.out.println(doc.name + " - Not Confidential");
            }
        }
    }
}