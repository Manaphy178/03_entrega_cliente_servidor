package constantesSQL;

public class ConstantesSQL {
	public final static String SQL_OBTENER_INSTRUMENTOS = "Select * From tabla_instrumentos";
	public final static String SQL_REGISTRAR_INSTRUMENTO = "INSERT INTO `tabla_instrumentos` (`nombre`, `tipo`, `marca`, `gamma`, `description`, `precio`) VALUES ( ?, ?, ?, ?, ?, ?);";
	public final static String SQL_BORRAR_INSTRUMENTOS = "DELETE FROM `tabla_instrumentos` WHERE `tabla_instrumentos`.`id` = ?;";
}
