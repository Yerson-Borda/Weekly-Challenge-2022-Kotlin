'''
  Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
  Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
  NO hace falta comprobar que ambas palabras existan.
  Dos palabras exactamente iguales no son anagrama.
'''

def CheckAnagram(first, second):
  if (len(first) == len(second) and first != second):
    base1 = ''.join(sorted(first.lower()))
    base2 = ''.join(sorted(second.lower()))
    return base1 == base2

  else: return False

print(CheckAnagram('listen', 'silent'))