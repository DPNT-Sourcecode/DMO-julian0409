package io.accelerate.solutions.DMO;

import io.accelerate.runner.SolutionNotImplementedException;
import java.util.HashMap;
import java.util.Map;

public class DemoRound3Solution {

    // State tracking maps
    private final Map<String, Integer> inventoryQuantities = new HashMap<>();
    private final Map<String, InventoryItem> itemDetails = new HashMap<>();

    /**
     * Adds a quantity of the given InventoryItem to the inventory.
     * If the item is already in the inventory, update its quantity.
     *
     * @param item     The InventoryItem object to be added/updated.
     * @param quantity The quantity of the item to add.
     * @return The current total quantity of the item in the inventory.
     */
    public int inventoryAdd(InventoryItem item, int quantity) {
        if (item == null || quantity <= 0) {
            throw new IllegalArgumentException("Item cannot be null and quantity must be positive.");
        }

        // Update or add quantity while preserving the item details
        inventoryQuantities.put(item.sku(),
                inventoryQuantities.getOrDefault(item.sku(), 0) + quantity);

        itemDetails.put(item.sku(), item);

        return inventoryQuantities.get(item.sku());
    }

    /**
     * Returns the count of unique items in the inventory.
     *
     * @return The number of distinct items (unique SKUs) in the inventory.
     */
    public int inventorySize() {
        return inventoryQuantities.size();
    }

    /**
     * Retrieves the InventoryItem by its SKU.
     *
     * @param sku The SKU of the item to retrieve.
     * @return The InventoryItem if found, or null if not found.
     */
    public InventoryItem inventoryGet(String sku) {
        if (sku == null || sku.isEmpty()) {
            return null;
        }

        return itemDetails.get(sku);
    }
}
