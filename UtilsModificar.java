package com.company;

import java.util.Objects;
import java.util.logging.Logger;

/**
 * Utility class for penalty testing with Checkstyle Google Style (Java).
 *
 * <p>Base score: 100 pts (zero Checkstyle violations).</p>
 *
 * <p>Instructions:
 * <ol>
 *   <li>Run the analysis on this file as-is to get score 100.</li>
 *   <li>Uncomment ONE block at a time.</li>
 *   <li>Re-run and verify the penalty applied.</li>
 *   <li>Re-comment before testing the next block.</li>
 * </ol>
 * </p>
 */
public final class UtilsModificar {

  private static final Logger LOGGER =
      Logger.getLogger(UtilsModificar.class.getName());

  private UtilsModificar() {
    // Utility class — prevent instantiation
  }

  /**
   * Returns the sum of two integers.
   *
   * @param firstValue the first operand
   * @param secondValue the second operand
   * @return the sum of firstValue and secondValue
   */
  public static int calculateSum(int firstValue, int secondValue) {
    return firstValue + secondValue;
  }

  /**
   * Returns the application version string.
   *
   * @return version string
   */
  public static String getVersion() {
    LOGGER.fine("Version requested.");
    return "1.0";
  }

  // ===========================================================================
  // TIPO 1 | CRÍTICO | Regla: IllegalCatch | Penalización: -5 pts c/u
  // Descripción: Captura de java.lang.Exception genérica (catch ilegal).
  // Acción   : Descomentar el método completo (12 líneas debajo).
  // Esperado : 100 - 5 = 95 pts  (1 violación × -5 pts)
  // ===========================================================================
  //
  // /**
  //  * Reads a file catching generic Exception — illegal catch violation.
  //  *
  //  * @param filePath the path to the file to read
  //  * @return file content or empty string on error
  //  */
  // public static String readWithIllegalCatch(String filePath) {
  //   Objects.requireNonNull(filePath, "filePath must not be null");
  //   try {
  //     return new String(java.nio.file.Files.readAllBytes(
  //         java.nio.file.Path.of(filePath)));
  //  } catch (Exception e) {
  //     LOGGER.warning(e.getMessage());
  //     return "";
  //   }
  // }

  // ===========================================================================
  // TIPO 2 | ALTA RELEVANCIA | Regla: VisibilityModifier | Penalización: -2 pts c/u
  // Descripción: Campo de instancia público (viola encapsulamiento).
  // Acción   : Descomentar las 2 líneas de campo debajo.
  // Esperado : 100 - 4 = 96 pts  (2 violaciones × -2 pts)
  // ===========================================================================
  //
   public String publicLabel = "exposed";
   public int publicCounter = 0;

  // ===========================================================================
  // TIPO 3 | MEDIA RELEVANCIA | Regla: MissingJavadocMethod | Penalización: -0.5 pts c/u
  // Descripción: Método público sin bloque de comentario Javadoc.
  // Acción   : Descomentar el método completo (3 líneas debajo).
  // Esperado : 100 - 0.5 = 99.5 pts  (1 violación × -0.5 pts)
  // ===========================================================================
  //
  // public static String getVersionWithoutJavadoc() {
  //  return "1.0";
  // }

  // ===========================================================================
  // TIPO 4 | BAJA RELEVANCIA | Regla: MethodName | Penalización: -0.1 pts c/u
  // Descripción: Nombre de método con snake_case en lugar de camelCase.
  // Acción   : Descomentar el método completo (7 líneas debajo).
  // Esperado : 100 - 0.1 = 99.9 pts  (1 violación × -0.1 pts)
  // ===========================================================================
  //
  // /**
  //  * Method with snake_case name — naming convention violation.
  //  *
  //  * @return a greeting string
  //  */
  // public static String get_version_snake() {
  //   return "1.0";
  // }

}
