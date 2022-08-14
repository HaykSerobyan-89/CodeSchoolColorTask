data class Rgb(val r: Int, val g: Int, val b: Int)

enum class Colors(val id: Int, private val color_hex: String, private val rgb: Rgb) {
    INDIAN_RED(1, "#CD5C5C", Rgb(205, 92, 92)),
    LIGHT_CORAL(2, "#F08080", Rgb(240, 128, 128)),
    SALMON(3, "#FA8072", Rgb(250, 128, 114)),
    DARK_SALMON(4, "#E9967A", Rgb(233, 150, 122)),
    LIGHT_SALMON(5, "#FFA07A", Rgb(255, 160, 122)),
    CRIMSON(6, "#DC143C", Rgb(220, 20, 60)),
    RED(7, "#FF0000", Rgb(255, 0, 0)),
    FIRE_BRICK(8, "#B22222", Rgb(178, 34, 34)),
    DARK_RED(9, "#8B0000", Rgb(139, 0, 0)),
    PINK(10, "#FFC0CB", Rgb(255, 192, 203)),
    LIGHT_PINK(11, "#FFB6C1", Rgb(255, 182, 193)),
    HOT_PINK(12, "#FF69B4", Rgb(255, 105, 180)),
    DEEP_PINK(13, "#FF1493", Rgb(255, 20, 147)),
    MEDIUM_VIOLET_PINK(14, "#C71585", Rgb(199, 21, 133)),
    PALE_VIOLET_PINK(15, "#DB7093", Rgb(219, 112, 147)),
    CORAL(17, "#FF7F50", Rgb(255, 127, 80)),
    TOMATO(18, "#FF6347", Rgb(255, 99, 71)),
    ORANGE_RED(19, "#FF4500", Rgb(255, 69, 0)),
    DARK_ORANGE(20, "#FF8C00", Rgb(255, 140, 0)),
    ORANGE(21, "#FFA500", Rgb(255, 165, 0)),
    GOLD(22, "#FFD700", Rgb(255, 215, 0)),
    YELLOW(23, "#FFFF00", Rgb(255, 255, 0)),
    LIGHT_YELLOW(24, "#FFFFE0", Rgb(255, 255, 224)),
    LEMON_CHIFFON(25, "#FFFACD", Rgb(255, 250, 205)),
    LIGHT_GOLDENROD_YELLOW(26, "#FAFAD2", Rgb(250, 250, 210)),
    PAPAYA_WHIP(27, "#FFEFD5", Rgb(255, 239, 213)),
    MOCASSIN(28, "#FFE4B5", Rgb(255, 228, 181)),
    PEACH_PUFF(29, "#FFDAB9", Rgb(255, 218, 185)),
    PALE_GOLDENROD(30, "#EEE8AA", Rgb(238, 232, 170)),
    KHAKI(31, "#F0E68C", Rgb(240, 230, 140)),
    DARK_KHAKI(32, "#BDB76B", Rgb(189, 183, 107)),
    DARK_MAGENTA(33, "#8B008B", Rgb(139, 0, 139));

    override fun toString(): String {
        return "$name(id=$id, color_hex='$color_hex', rgb=$rgb)"
    }
}