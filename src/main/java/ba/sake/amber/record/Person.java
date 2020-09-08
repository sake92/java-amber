package ba.sake.amber.record;

/**
 * - final class<br>
 * - free: accessors, toString(), equals()+hashCode()<br>
 * - must use primary constructor -> "constructor chaining", a recommended practice
 */
record Person(String name, int age) {}