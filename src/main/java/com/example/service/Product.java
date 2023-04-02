/**
 * Contains classes for managing products.
 */
package com.example.service;

/**
 * Represents a product, which has an ID and some content.
 * <p>
 * This class is implemented as a record, which is a concise way of declaring
 * a class that is mainly used for holding data.
 * </p>
 *
 * @param id      the ID of the product
 * @param content the content of the product
 */
public record Product(long id, String content) {
}
