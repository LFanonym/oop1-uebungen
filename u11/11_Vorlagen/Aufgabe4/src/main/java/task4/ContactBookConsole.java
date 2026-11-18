package task4;

public class ContactBookConsole {
    static void main() {

        var book = new ContactBook();

        var line = IO.readln("Command (add, find, load, save), SPACE for end: ");
        while (!line.isEmpty()) {
            try {
                processLine(book, line);
            } catch (ContactBookException e) {
                IO.println(e.getMessage());
            }
            line = IO.readln("Command (add, find, load, save), SPACE for end: ");
        }
    }

    public static void processLine(ContactBook book, String line) throws ContactBookException {
        var parser = new CommandParser(line);
        if (parser.tryRead("load")) {
            parser.checkEnd();
            book.load();
        } else if (parser.tryRead("save")) {
            parser.checkEnd();
            book.save();
        } else if (parser.tryRead("add")) {
            if (parser.tryRead("contact")) {
                var name = parser.readString();
                var address = parser.readString();
                parser.checkEnd();
                book.addContact(name, address);
            } else if (parser.tryRead("number")) {
                var name = parser.readString();
                var number = parser.readString();
                var description = parser.readString();
                parser.checkEnd();
                book.addNumber(name, number, description);
            } else {
                throw new ContactBookException("Invalid add command");
            }
        } else if (parser.tryRead("find")) {
            var name = parser.readString();
            var contact = book.findContact(name);
            parser.checkEnd();
            if (contact == null) {
                IO.println("not present");
            } else {
                IO.println(contact);
            }
        } else {
            throw new ContactBookException("Invalid command");
        }
    }

    static class CommandParser {
        private String line;

        public CommandParser(String line) {
            this.line = line;
        }

        public boolean tryRead(String command) {
            if (line.startsWith(command)) {
                line = line.substring(command.length());
                skipBlanks();
                return true;
            } else {
                return false;
            }
        }

        private void skipBlanks() {
            while (line.startsWith(" ")) {
                line = line.substring(1);
            }
        }

        public void checkEnd() throws ContactBookException {
            if (line.length() == 1) {
                throw new ContactBookException("Premature end of command");
            }
        }

        public String readString() throws ContactBookException {
            if (!tryRead("\"")) {
                throw new ContactBookException("Opening double quote missing");
            }
            int index = line.indexOf('\"');
            if (index < 0) {
                throw new ContactBookException("closing double quote missing");
            }
            var text = line.substring(0, index);
            line = line.substring(index + 1);
            skipBlanks();
            return text;
        }
    }
}
