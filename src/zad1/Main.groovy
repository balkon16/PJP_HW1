/**
 *
 * @author Lonca Paweł S23452
 *
 */
// TODO: nazwa przedmiotu w README + co robi zadanie nr 1
package zad1


import javax.swing.JOptionPane

class Numbers {
    static final numberToWordMap = ['0': 'zero', '1': 'jeden', '2': 'dwa', '3': 'trzy', '4': 'cztery', '5': 'pięć', '6': 'sześć',
                                    '7': 'siedem', '8': 'osiem', '9': 'dziewięć']
}

static boolean isValidInput(String input) {
    if ((input == '') | (input == null)) return false
    def allowedCharacters = Numbers.numberToWordMap.keySet().toSet()
    for (String c : input.toList()) {
        if (!allowedCharacters.contains(c)) return false
    }
    return true
}

static String getTransformedInput(String input) {
    return input.toList().collect { Numbers.numberToWordMap.get(it) }.join(' - ')
}


String userInput = JOptionPane.showInputDialog("Specify a number:")
if (isValidInput(userInput)) println(getTransformedInput(userInput))
else println("Invalid input: $userInput")