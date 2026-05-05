fun main() {
    val signalcase_1 = Signal(83, 105, 26, 14, 13)
    check(Policy.score(signalcase_1) == 201)
    check(Policy.classify(signalcase_1) == "accept")
    val signalcase_2 = Signal(85, 80, 17, 11, 8)
    check(Policy.score(signalcase_2) == 193)
    check(Policy.classify(signalcase_2) == "accept")
    val signalcase_3 = Signal(77, 80, 16, 8, 8)
    check(Policy.score(signalcase_3) == 194)
    check(Policy.classify(signalcase_3) == "accept")
}
