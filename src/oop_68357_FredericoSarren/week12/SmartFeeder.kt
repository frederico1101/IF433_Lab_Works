package oop_68357_FredericoSarren.week12


fun dispenseKibble(
    requestedGram: Int,
    availableGram: Int,
    isJammed: Boolean
): Int {

    require(requestedGram > 0) {
        "Porsi kibble harus lebih dari 0 gr"
    }

    if (isJammed) {
        throw DispenserJamException()
    }

    return availableGram
}