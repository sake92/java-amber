
Code for my presentation:  
https://sake.ba/presentations/2020-09-09%20Amber%20-%20JUGBA/#/


Download [CFR decompiler](https://www.benf.org/other/cfr/) to see what's under the hood!

`tree /F out/production/classes`

## Vars
```bash
java -jar cfr-0.150.jar out\production\classes\ba\sake\amber\var\VarDemo.class
```

## Multiline strings
```bash
java -jar cfr-0.150.jar out\production\classes\ba\sake\amber\text_block\MulitilineStringDemo.class
```

## Pattern Matching for instanceof 
```bash
java -jar cfr-0.150.jar --instanceofpattern false out\production\classes\ba\sake\amber\instance_of\InstanceOfDemo.class
```

## Switch Expressions 
```bash
java -jar cfr-0.150.jar --switchexpression false out\production\classes\ba\sake\amber\switch_expr\SwitchDemo.class
```

## Records
```bash
java -jar cfr-0.150.jar --recordtypes false out\production\classes\ba\sake\amber\record\Person.class
```

## Sealed types
CFR not yet updated...
```bash
C:\java\jdk-15\bin\javap.exe -v out\production\classes\ba\sake\amber\sealed\Shape.class
```







