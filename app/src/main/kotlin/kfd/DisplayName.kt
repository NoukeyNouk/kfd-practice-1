package kfd

fun displayName(name: String?): String {
    if (name == null) return "Гость"
    if (name.trim() == "") return "Гость"
    return name.trim()

}