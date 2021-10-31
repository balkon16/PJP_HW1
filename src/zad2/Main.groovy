/**
 *
 * @author Lonca Paweł S23452
 *
 */

// TODO: funkcja do dodawania w ramach grupy -> coś sprytnego z programowania funkcyjnego
// TODO: zaprojektować ekran do wprowadzania -> https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
//  > dwa przyciski: Dalej, Podlicz

package zad2

import javax.swing.JOptionPane;

static validateAndTransformUserInput(String userInput) {
    def pattern = /^(\p{L}+) = ([0-9]+(\.[0-9]+)?)$/

    def matcher = userInput =~ pattern
    if (matcher) return new Tuple2<>(true, new Tuple2<>(matcher[0][1].toString(), Double.valueOf(matcher[0][2])))
    else return new Tuple2<>(false, null)
}

println(validateAndTransformUserInput("chleb = 10,51"))