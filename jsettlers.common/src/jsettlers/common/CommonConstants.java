package jsettlers.common;

public abstract class CommonConstants {
	public static final int FOG_OF_WAR_VISIBLE = 100;
	public static final int FOG_OF_WAR_EXPLORED = 50;

	public static final short TOWER_RADIUS = 40;
	public static final int MAX_PLAYERS = 16;

	/**
	 * If true, all players of a map will always be positioned on startup.
	 */
	public static boolean ACTIVATE_ALL_PLAYERS = false;

	/**
	 * If true, all System.err and System.out will be printed to the console instead of a file
	 */
	public static boolean ENABLE_CONSOLE_LOGGING = false;

	public static final boolean ENABLE_GRAPHICS_TIMES_DEBUG_OUTPUT = false;

	/**
	 * NOTE: this value has only an effect if it's changed before the MainGrid is created! IT MUSTN'T BE CHANGED AFTER A MAIN GRID HAS BEEN CREATED<br>
	 * if false, no debug coloring is possible (but saves memory) <br>
	 * if true, debug coloring is possible.
	 */
	public static boolean ENABLE_DEBUG_COLORS = true;

	public static String DEFAULT_SERVER_ADDRESS = "87.106.88.80";

	public static boolean CONTROL_ALL = false;
}
