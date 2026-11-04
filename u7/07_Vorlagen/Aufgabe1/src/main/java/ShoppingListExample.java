import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingListExample {

    static void main() {

        // Liste erstellen
        List<String> shoppingList = new ArrayList<>();

        // Produkte hinzufügen
        shoppingList.add("Milch");
        shoppingList.add("Brot");
        shoppingList.add("Äpfel");
        shoppingList.add("Käse");
        shoppingList.add("Milch");

        // 1. Alle Produkte mit for-each ausgeben
        for (String item: shoppingList) {
            IO.println(item);
        }

        // 2. Butter hinzufügen
        shoppingList.add("Butter");

        // 3. Erstes Vorkommen von Milch entfernen
        shoppingList.remove("Milch");

        // 4. Anzahl der Produkte
        IO.println(shoppingList.size());

        // 5. Prüfen, ob Brot enthalten ist
        IO.println(shoppingList.contains("Brot"));

        // 6. Liste mit Iterator durchlaufen
        Iterator<String> iterator = shoppingList.iterator();
        while (iterator.hasNext()) {
            IO.println(iterator.next());
        }

        // 7. Käse während der Iteration entfernen
        iterator = shoppingList.iterator();
        while (iterator.hasNext()) {
            var item = iterator.next();
            if (item.equals("Käse")) {
                iterator.remove();
            }
        }

        // 8. Endgültige Liste ausgeben
        for(String item: shoppingList) {
            IO.println(item);
        }
    }
}