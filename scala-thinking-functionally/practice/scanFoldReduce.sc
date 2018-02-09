val someNumbers = List(10,20,30,40,50)
someNumbers.scanRight(0)(_-_)
someNumbers.scanLeft(0)(_-_)