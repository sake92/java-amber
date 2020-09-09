package ba.sake.amber.sealed;

/**
 * - subtypes must be one of: <b>final, non-sealed, sealed</b> <br>
 * - can't be used <b>outside of package</b>, current limitation
 */
sealed class Shape {}

final class Circle extends Shape {}

final class Rectangle extends Shape {}

final class Square extends Shape {}