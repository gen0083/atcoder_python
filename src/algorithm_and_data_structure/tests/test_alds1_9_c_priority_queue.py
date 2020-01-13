from tests.si_so_test_case import SISOTestCase
from algorithm_and_data_structure.alds1_9_c_priority_queue import main


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""insert 8
insert 2
extract
insert 10
extract
insert 11
extract
extract
end
""", """8
10
11
2
""", main)

    def test_main2(self):
        with open("alds1_9_c_in.txt") as i:
            with open("alds1_9_c_out.txt") as o:
                input_data = "".join(i.readlines())
                output_data = "".join(o.readlines())
                self.helper(input_data, output_data, main)

    def test_main3(self):
        self.helper("""insert 0
insert 765933
insert 377743
insert 216262
insert 391529
insert 669700
insert 475508
insert 349752
insert 887256
insert 417256
insert 158119
insert 699711
insert 268351
insert 772843
insert 78705
insert 754108
insert 546393
insert 118330
insert 137366
insert 932169
insert 957932
insert 226917
insert 669847
insert 937972
insert 32868
insert 206980
insert 706223
insert 638549
insert 567592
insert 488164
insert 776169
insert 126551
insert 950427
insert 516190
insert 542624
insert 40635
insert 604920
insert 427944
insert 719310
insert 269862
insert 998484
insert 937363
insert 643301
insert 914710
insert 267236
insert 351876
insert 750431
insert 579929
insert 560397
insert 500675
insert 970491
insert 224190
insert 59344
insert 458134
insert 268425
insert 841629
insert 844030
insert 252727
insert 429126
insert 141743
insert 687334
insert 934104
insert 674760
insert 629749
insert 965620
insert 230256
insert 670932
insert 35572
insert 531613
insert 402490
insert 954509
insert 127119
insert 337405
insert 875695
insert 654049
insert 430327
insert 656719
insert 33497
insert 566824
insert 92596
insert 218649
insert 287356
insert 654184
insert 623093
insert 222245
insert 581007
insert 99306
insert 426509
insert 442754
insert 580352
insert 425665
insert 216783
insert 638738
insert 170801
insert 979690
insert 161330
insert 887337
insert 228195
insert 636656
insert 95963
insert 82011
insert 299427
insert 840042
insert 487106
insert 400968
insert 206212
insert 759001
insert 834510
insert 882480
insert 284658
insert 886571
insert 983331
insert 814
insert 784847
insert 170564
insert 13197
insert 103625
insert 748438
insert 460931
insert 998018
insert 998487
insert 570151
insert 169187
insert 409913
insert 324179
insert 26995
insert 671750
insert 411750
insert 364913
insert 295562
insert 931134
insert 962273
insert 243547
insert 418521
insert 304830
insert 159140
insert 925557
insert 777678
insert 854726
insert 938503
insert 550597
insert 320408
insert 884893
insert 213988
insert 339238
insert 117085
insert 440093
insert 677188
insert 742720
insert 483211
insert 958746
insert 332387
insert 815710
insert 79209
insert 595887
insert 858668
insert 583103
insert 123473
insert 71900
insert 207674
insert 375105
insert 796183
insert 140952
insert 984370
insert 151787
insert 159302
insert 727410
insert 21905
insert 512110
insert 305400
insert 157996
insert 950142
insert 898585
insert 191860
insert 797047
insert 143924
insert 685731
insert 321158
insert 675386
insert 535219
insert 316400
insert 43415
insert 4055
insert 481682
insert 969874
insert 643061
insert 115006
insert 283602
insert 189268
insert 689365
insert 50470
insert 136518
insert 26723
insert 376089
insert 349106
insert 694319
insert 3130
insert 247655
insert 818732
insert 293993
insert 559974
insert 127595
insert 688810
insert 823673
insert 845055
insert 508730
insert 256095
insert 558245
insert 30705
insert 147694
insert 222948
insert 559873
insert 928353
insert 934474
insert 520760
insert 380741
insert 526756
insert 155644
insert 723143
insert 531640
insert 183737
insert 284679
insert 176135
insert 901149
insert 821529
insert 427210
insert 386607
insert 224417
insert 255255
insert 953787
insert 909373
insert 707626
insert 707445
insert 884112
insert 79172
insert 813595
insert 827153
insert 55053
insert 505183
insert 161717
insert 914655
insert 846017
insert 909176
insert 333077
insert 238776
insert 515399
insert 350654
insert 792728
insert 623002
insert 482161
insert 905455
insert 708870
insert 968316
insert 735694
insert 19381
insert 757930
insert 807480
insert 126604
insert 753386
insert 861359
insert 476207
insert 41954
insert 256079
insert 373702
insert 421365
insert 274453
insert 703732
insert 439836
insert 168432
insert 894563
insert 723017
insert 435107
insert 983583
insert 814910
insert 108467
insert 148116
insert 671546
insert 551719
insert 725528
insert 348071
insert 80107
insert 178256
insert 458520
insert 922353
insert 976528
insert 888154
insert 56430
insert 873477
insert 695048
insert 846520
insert 931204
insert 483414
insert 580810
insert 835719
insert 947925
insert 258298
insert 332131
insert 11701
insert 726709
insert 130751
insert 305022
insert 512817
insert 548652
insert 473924
insert 934695
insert 860471
insert 161153
insert 4625
insert 230978
insert 355616
insert 501142
insert 346597
insert 357088
insert 341732
insert 831917
insert 644404
insert 692743
insert 680395
insert 542749
insert 654407
insert 555936
insert 374302
insert 883767
insert 166045
insert 751563
insert 830340
insert 33398
insert 444896
insert 613051
insert 287807
insert 751767
insert 404997
insert 178978
insert 80650
insert 327809
insert 562330
insert 92360
insert 530716
insert 65161
insert 252293
insert 763209
insert 323753
insert 846098
insert 665130
insert 979634
insert 534543
insert 171889
insert 574088
insert 179031
insert 300692
insert 920401
insert 968674
insert 172294
insert 415693
insert 491165
insert 471949
insert 238765
insert 257737
insert 582458
insert 400841
insert 817048
insert 465943
insert 36229
insert 490215
insert 467389
insert 707209
insert 610388
insert 59754
insert 580243
insert 213501
insert 262271
insert 776516
insert 377564
insert 650277
insert 186912
insert 410005
insert 320611
insert 667212
insert 872782
insert 83092
insert 23123
insert 159201
insert 668324
insert 334004
insert 231437
insert 352602
insert 68804
insert 163363
insert 371391
insert 14273
insert 56575
insert 749906
insert 511759
insert 506626
insert 751896
insert 278859
insert 587763
insert 26358
insert 83577
insert 150484
insert 877747
insert 507156
insert 475948
insert 23605
insert 575454
insert 16194
insert 623359
insert 113430
insert 884323
insert 645883
insert 221024
insert 361447
insert 20202
insert 630847
insert 408876
insert 206049
insert 71792
insert 799588
insert 749304
insert 909133
insert 651558
insert 894842
insert 736414
insert 544567
insert 491728
insert 318506
insert 228391
insert 987000
insert 488992
insert 51118
insert 953398
insert 951718
insert 329868
insert 331975
insert 640579
insert 82119
insert 831363
insert 274596
insert 525379
insert 507916
insert 431466
insert 343840
insert 564232
insert 816430
insert 677414
insert 593155
insert 294571
insert 430311
insert 816179
insert 840796
insert 585300
insert 464216
insert 690903
insert 201993
insert 201055
insert 63728
insert 212481
insert 495905
insert 326029
insert 201037
insert 479897
insert 441286
insert 908657
insert 491377
insert 70682
insert 789554
insert 206506
insert 110757
insert 376529
insert 269580
insert 824641
insert 643866
insert 104852
insert 141933
insert 540660
insert 8490
insert 712616
insert 874732
insert 711606
insert 688114
insert 301185
insert 856647
insert 601227
insert 859435
insert 180058
insert 819183
insert 971110
insert 551742
insert 649374
insert 730604
insert 404671
insert 498872
insert 314605
insert 610480
insert 352671
insert 426979
insert 88717
insert 45481
insert 628680
insert 423791
insert 991775
insert 83000
insert 295046
insert 491832
insert 518468
insert 334858
insert 10226
insert 758178
insert 818666
insert 219468
insert 406254
insert 603703
insert 763463
insert 150922
insert 392511
insert 720893
insert 43648
insert 965957
insert 668831
insert 382919
insert 111512
insert 897092
insert 46232
insert 762220
insert 320223
insert 848038
insert 58609
insert 807452
insert 788522
insert 321728
insert 741976
insert 975152
insert 501517
insert 641423
insert 281402
insert 538704
insert 271936
insert 379350
insert 591035
insert 817825
insert 331128
insert 433964
insert 803426
insert 844165
insert 394775
insert 783404
insert 244164
insert 476873
insert 297258
insert 993624
insert 555821
insert 358829
insert 193777
insert 992224
insert 920226
insert 827604
insert 388451
insert 105037
insert 664838
insert 386625
insert 321379
insert 990419
insert 638575
insert 188688
insert 549897
insert 506820
insert 917078
insert 37966
insert 118797
insert 827055
insert 716674
insert 528228
insert 220402
insert 642676
insert 294279
insert 580382
insert 334976
insert 631261
insert 486327
insert 311491
insert 113282
insert 170074
insert 36761
insert 597342
insert 628697
insert 87033
insert 509805
insert 482318
insert 731875
insert 558938
insert 482320
insert 260757
insert 613439
insert 313288
insert 874771
insert 424527
insert 30856
insert 799868
insert 458064
insert 592570
insert 134479
insert 486267
insert 774338
insert 251411
insert 323206
insert 353746
insert 733278
insert 272970
insert 917810
insert 285884
insert 195142
insert 104596
insert 617208
insert 827071
insert 607168
insert 659376
insert 685007
insert 783312
insert 748948
insert 266717
insert 338357
insert 156218
insert 499854
insert 230990
insert 359853
insert 25239
insert 848449
insert 508984
insert 952711
insert 33974
insert 618821
insert 314636
insert 476328
insert 455785
insert 356493
insert 982267
insert 704243
insert 677531
insert 526954
insert 9139
insert 248983
insert 464283
insert 951684
insert 179015
insert 406596
insert 706088
insert 225534
insert 281651
insert 727422
insert 164213
insert 527889
insert 102625
insert 433885
insert 761397
insert 22576
insert 780715
insert 519849
insert 149840
insert 560513
insert 708888
insert 396422
insert 727279
insert 705582
insert 951940
insert 350866
insert 215546
insert 227800
insert 687163
insert 241922
insert 436278
insert 673045
insert 477236
insert 928757
insert 677899
insert 635185
insert 27271
insert 606817
insert 537992
insert 630432
insert 849098
insert 623131
insert 919245
insert 66184
insert 226186
insert 162635
insert 563802
insert 429704
insert 411850
insert 511577
insert 641187
insert 82095
insert 770292
insert 96778
insert 747337
insert 473287
insert 234619
insert 824515
insert 210887
insert 314057
insert 584453
insert 380553
insert 989888
insert 188583
insert 204785
insert 247175
insert 912089
insert 252809
insert 62353
insert 555595
insert 129097
insert 7569
insert 590270
insert 815168
insert 817238
insert 226198
insert 902483
insert 877144
insert 858591
insert 927100
insert 314942
insert 797353
insert 959585
insert 973902
insert 624189
insert 469145
insert 17519
insert 441090
insert 92544
insert 649669
insert 886342
insert 330760
insert 482697
insert 1700
insert 740977
insert 822125
insert 884083
insert 79778
insert 744350
insert 911703
insert 882794
insert 255680
insert 585459
insert 13956
insert 509526
insert 597520
insert 780975
insert 35296
insert 868148
insert 718917
insert 945608
insert 649326
insert 943845
insert 890282
insert 636934
insert 976466
insert 761036
insert 254645
insert 618304
insert 502643
insert 450025
insert 335255
insert 628369
insert 501259
insert 14323
insert 277879
insert 954182
insert 577707
insert 170739
insert 969356
insert 16123
insert 577918
insert 189335
insert 271097
insert 900753
insert 544808
insert 556269
insert 552334
insert 19485
insert 729120
insert 90906
insert 932214
insert 201680
insert 969070
insert 169279
insert 275762
insert 717375
insert 636271
insert 745614
insert 227744
insert 478063
insert 283326
insert 32043
insert 804875
insert 951723
insert 769057
insert 826911
insert 509418
insert 44961
insert 678472
insert 378811
insert 644766
insert 14823
insert 144839
insert 325074
insert 982510
insert 619802
insert 802322
insert 147145
insert 369922
insert 241236
insert 990833
insert 24347
insert 415734
insert 587278
insert 910311
insert 827009
insert 594613
insert 819437
insert 699817
insert 550213
insert 848150
insert 26603
insert 56069
insert 858287
insert 915491
insert 836549
insert 810055
insert 232205
insert 702629
insert 135668
insert 357629
insert 355252
insert 619811
insert 675250
insert 777970
insert 603645
insert 813391
insert 403090
insert 345774
insert 483564
insert 832017
insert 875958
insert 160353
insert 352816
insert 848174
insert 189783
insert 904716
insert 583407
insert 188008
insert 646894
insert 908256
insert 974263
insert 817290
insert 506249
insert 639895
insert 315882
insert 801906
insert 119049
insert 167023
insert 543449
insert 872853
insert 742564
insert 804739
insert 648064
insert 538802
insert 344073
insert 24643
insert 911711
insert 413059
insert 506547
insert 888169
insert 620976
insert 381152
insert 548833
insert 233404
insert 349348
insert 906089
insert 516265
insert 93510
insert 48302
insert 411997
insert 770466
insert 217822
insert 798883
insert 817128
insert 522980
insert 2845
insert 522095
insert 265717
insert 225049
insert 726419
insert 198126
insert 365729
insert 750578
insert 129536
insert 599183
insert 258574
insert 658048
insert 945038
insert 293906
insert 926313
insert 118292
insert 681891
insert 576219
insert 647790
insert 148016
insert 827548
insert 887763
insert 221517
insert 528017
insert 795941
insert 404448
insert 912098
insert 318386
insert 621222
insert 551807
insert 646225
insert 130694
insert 292424
insert 553547
insert 90483
insert 142618
insert 170047
insert 973890
insert 555438
insert 953564
insert 83895
insert 239541
insert 651077
insert 640917
insert 588232
insert 775615
insert 366610
insert 875725
insert 719385
insert 596914
insert 789171
insert 106306
insert 785653
insert 823640
insert 618398
insert 967244
insert 339209
insert 793905
insert 516123
insert 506577
insert 17280
insert 396580
insert 681368
insert 822158
insert 212670
insert 157396
insert 800351
insert 461943
insert 503266
insert 984838
insert 454173
insert 806731
insert 420852
insert 148034
insert 691981
insert 87862
insert 457298
insert 133201
insert 583939
insert 515998
insert 532311
insert 428884
insert 471873
insert 200258
insert 193316
insert 315143
insert 63478
insert 194674
insert 500437
insert 103029
insert 869415
insert 202571
insert 75467
insert 988557
insert 43135
insert 154455
insert 737292
insert 108548
insert 398704
insert 437291
insert 726364
insert 555678
insert 744708
insert 991855
insert 691067
insert 536273
insert 104225
insert 387401
insert 220426
insert 923565
insert 202287
insert 521299
insert 530724
insert 3916
extract
insert 651453
extract
insert 638553
insert 540155
extract
insert 121287
extract
extract
insert 987984
extract
insert 405442
insert 479961
insert 950701
insert 637097
extract
extract
insert 58980
insert 756015
extract
insert 148194
extract
insert 103892
insert 38653
extract
extract
insert 980090
insert 667042
extract
insert 788390
insert 775475
extract
insert 673572
insert 742211
insert 617994
insert 848275
insert 982384
insert 880779
extract
extract
insert 394066
insert 801177
extract
insert 833934
insert 269517
insert 370898
insert 680857
extract
insert 746014
insert 635411
extract
insert 305889
insert 328503
extract
extract
extract
insert 625505
extract
insert 797611
extract
extract
extract
insert 449734
insert 689035
insert 174445
extract
extract
insert 279134
insert 42579
insert 771559
extract
insert 381745
extract
extract
extract
insert 11413
extract
extract
insert 72220
extract
extract
extract
extract
extract
extract
extract
extract
insert 147196
insert 490346
extract
extract
extract
extract
extract
insert 960978
extract
insert 536635
insert 819247
insert 229109
extract
extract
insert 159421
extract
insert 378217
insert 935123
insert 164617
extract
insert 839727
extract
insert 997117
extract
extract
insert 940838
extract
extract
extract
extract
extract
insert 928080
extract
insert 929173
extract
extract
insert 757590
insert 568262
extract
insert 918184
extract
extract
extract
insert 17236
extract
extract
insert 56917
extract
extract
insert 357370
insert 483900
insert 383235
extract
extract
insert 516981
extract
extract
insert 560362
extract
insert 808788
insert 15375
insert 891966
insert 562804
extract
extract
extract
insert 283694
extract
insert 861309
insert 169662
extract
extract
extract
insert 167667
insert 851789
insert 719946
extract
insert 483580
insert 792834
insert 755460
extract
extract
extract
extract
extract
insert 956955
extract
insert 51610
insert 797031
insert 312293
extract
insert 358492
extract
extract
extract
extract
insert 1781
insert 556097
extract
insert 584241
extract
insert 544492
insert 749367
extract
insert 502019
insert 11568
insert 144758
extract
extract
insert 865737
insert 727456
insert 807728
extract
insert 573478
extract
insert 870255
insert 68693
insert 762665
extract
extract
insert 50006
insert 965852
insert 26913
extract
insert 293634
insert 4478
insert 792520
insert 132976
insert 186103
extract
extract
extract
insert 435199
extract
insert 26838
insert 626000
extract
extract
extract
extract
extract
extract
extract
extract
insert 555417
insert 967772
insert 877575
extract
insert 689310
extract
extract
extract
insert 374360
extract
extract
insert 623347
extract
extract
extract
insert 899552
insert 336416
insert 947764
extract
extract
extract
insert 2244
extract
extract
extract
extract
insert 655714
extract
extract
extract
extract
insert 583186
insert 885281
insert 424972
extract
extract
insert 913816
extract
insert 449294
extract
extract
insert 131134
insert 737078
extract
insert 714230
extract
insert 901816
extract
insert 30837
insert 916797
extract
insert 769794
extract
insert 82525
insert 533444
insert 713806
insert 880311
extract
extract
extract
insert 476882
insert 842825
insert 263258
insert 871958
insert 31298
extract
insert 978154
insert 145251
extract
extract
extract
insert 198523
insert 45394
extract
extract
insert 947583
insert 93884
extract
insert 20657
extract
insert 802153
insert 986443
insert 783821
insert 438753
insert 748632
insert 189633
extract
extract
insert 96096
insert 547622
insert 996397
extract
insert 837891
insert 302169
insert 686847
insert 240400
extract
extract
extract
extract
insert 874346
extract
insert 937459
extract
extract
extract
extract
insert 219254
extract
extract
extract
insert 971933
insert 821822
insert 369642
insert 405110
insert 994473
extract
insert 285175
insert 230826
extract
insert 907616
insert 631554
extract
insert 524226
extract
insert 590723
extract
insert 688753
insert 555443
extract
extract
insert 975687
insert 552412
insert 716241
insert 967246
extract
extract
extract
extract
extract
insert 432431
insert 755198
extract
insert 96229
extract
extract
extract
insert 932195
extract
extract
insert 604639
extract
extract
insert 876016
insert 152795
extract
insert 652207
extract
extract
insert 487065
extract
insert 121478
insert 707565
insert 240165
extract
insert 424144
insert 959036
insert 666695
extract
extract
extract
extract
insert 680162
extract
extract
insert 823932
extract
insert 905431
extract
extract
extract
extract
insert 632943
extract
insert 398181
insert 624066
insert 746292
insert 692252
insert 634629
extract
extract
extract
extract
extract
insert 679563
insert 591821
extract
insert 649486
insert 977006
extract
insert 936797
insert 253902
insert 748822
extract
extract
insert 342588
insert 480877
extract
insert 109147
insert 54787
insert 587393
extract
extract
extract
extract
extract
extract
insert 707877
extract
extract
extract
insert 401393
insert 626281
extract
extract
insert 72041
extract
insert 725366
insert 303842
insert 742166
extract
insert 850671
insert 297143
insert 446356
extract
insert 892107
insert 836441
insert 545804
extract
extract
insert 407322
insert 280399
extract
extract
extract
insert 921717
extract
insert 792585
insert 14456
insert 11397
extract
extract
insert 917957
extract
extract
insert 367460
insert 184286
insert 504
extract
extract
insert 359697
extract
insert 447704
insert 625792
insert 92321
extract
extract
insert 582411
insert 816289
extract
extract
insert 904919
insert 952478
extract
extract
extract
extract
extract
insert 289563
insert 49330
insert 328100
extract
insert 476494
insert 147499
extract
extract
insert 506322
extract
extract
insert 174777
extract
insert 239361
insert 434555
insert 906704
extract
insert 767218
extract
insert 655605
extract
insert 396532
extract
extract
extract
insert 981415
insert 760324
insert 453872
insert 311620
insert 202444
extract
extract
extract
extract
insert 159522
insert 315897
insert 352850
insert 567234
insert 398067
extract
extract
extract
extract
extract
extract
insert 263954
insert 780249
insert 224585
extract
extract
insert 973391
extract
insert 289418
extract
insert 124283
insert 920851
extract
insert 60692
extract
extract
extract
insert 447088
insert 149721
extract
insert 537370
extract
extract
insert 914803
extract
extract
insert 159253
extract
insert 515414
extract
extract
extract
extract
insert 990003
extract
insert 949528
insert 83761
insert 445917
extract
extract
extract
extract
extract
insert 472536
extract
insert 769303
extract
insert 789738
insert 389704
extract
extract
extract
extract
insert 774935
extract
extract
extract
extract
extract
extract
insert 303276
insert 721672
extract
insert 860646
insert 784439
insert 263945
extract
insert 819255
extract
extract
insert 418843
insert 976381
insert 568917
insert 445171
insert 315283
insert 578553
extract
extract
insert 148856
insert 894031
extract
extract
insert 249723
insert 220705
extract
insert 400688
insert 575316
extract
extract
insert 248615
insert 527120
extract
extract
insert 16090
extract
extract
insert 113214
insert 80349
insert 110509
extract
extract
insert 847000
extract
extract
insert 858359
extract
extract
extract
extract
extract
insert 156671
extract
extract
extract
insert 197971
insert 999808
extract
extract
insert 483071
insert 547873
extract
insert 312900
insert 471198
extract
insert 672618
insert 178290
extract
insert 637638
extract
extract
insert 120829
extract
extract
extract
insert 880253
insert 319216
extract
insert 191786
extract
extract
extract
extract
extract
insert 178441
insert 914355
insert 299808
insert 748198
extract
extract
insert 777026
extract
extract
extract
extract
insert 989097
insert 633244
insert 691982
extract
extract
insert 903025
insert 280497
extract
extract
extract
insert 977854
extract
insert 617767
extract
extract
extract
extract
insert 570385
extract
extract
insert 437714
extract
insert 686495
insert 235452
insert 851915
insert 136142
extract
extract
insert 758795
insert 66916
insert 136706
extract
extract
insert 741166
extract
extract
insert 391493
extract
extract
insert 546282
insert 705731
extract
extract
extract
extract
insert 940845
extract
insert 262647
insert 63047
insert 95141
extract
extract
extract
extract
insert 114775
insert 921500
extract
extract
extract
extract
insert 915460
insert 28997
insert 982510
insert 779497
insert 92868
extract
insert 395116
insert 216142
extract
extract
insert 496058
extract
insert 39952
extract
extract
extract
insert 380286
insert 557445
insert 623021
insert 159607
extract
extract
insert 8646
extract
extract
insert 300053
insert 276031
insert 804955
insert 460963
insert 957572
insert 381887
insert 143688
insert 829566
insert 536255
insert 744140
extract
insert 874762
insert 772825
extract
insert 823733
insert 513836
extract
extract
insert 609898
insert 264100
extract
insert 3261
extract
extract
insert 299308
insert 767854
insert 579824
extract
insert 18575
extract
extract
extract
insert 540146
insert 983244
insert 880545
extract
insert 147683
insert 991724
insert 43362
extract
insert 873084
insert 584256
extract
extract
insert 370288
insert 348781
insert 273455
extract
extract
extract
extract
extract
extract
insert 493149
insert 654928
insert 581116
insert 640540
insert 993049
insert 798558
insert 792419
insert 453874
extract
insert 171874
extract
extract
insert 460390
extract
insert 808779
insert 359053
extract
extract
insert 541007
insert 28443
extract
extract
extract
extract
extract
insert 905125
insert 936700
extract
extract
extract
extract
extract
extract
insert 577212
insert 914876
extract
insert 181443
extract
extract
extract
extract
extract
extract
extract
extract
insert 699052
extract
insert 596991
extract
extract
extract
insert 457665
insert 346104
extract
extract
extract
insert 490555
insert 712487
insert 795604
extract
insert 155147
insert 7073
extract
insert 328953
extract
extract
insert 916899
extract
insert 92258
extract
insert 34234
insert 749460
extract
insert 348984
insert 562204
extract
extract
insert 736678
extract
insert 366505
extract
extract
extract
extract
insert 414691
extract
extract
insert 95908
extract
insert 704325
insert 672380
insert 595147
insert 446487
insert 636436
extract
extract
extract
extract
insert 444792
extract
insert 502753
insert 81532
extract
insert 821948
insert 820512
insert 824787
insert 231288
insert 541693
extract
extract
extract
insert 364870
extract
extract
extract
insert 62839
extract
insert 566469
insert 91650
insert 811369
extract
insert 66923
insert 193504
extract
insert 592065
insert 347381
extract
insert 58140
insert 713395
extract
extract
extract
extract
extract
insert 700912
extract
extract
insert 901811
extract
insert 912895
insert 948537
extract
extract
insert 768183
insert 851381
insert 458985
extract
extract
extract
extract
insert 592695
insert 916380
extract
insert 715432
insert 835268
end
""", """998487
998484
998018
993624
992224
991855
991775
990833
990419
989888
988557
987984
987000
984838
984370
983583
983331
982510
982384
982267
980090
979690
979634
976528
976466
975152
974263
973902
973890
971110
970491
969874
969356
969070
968674
968316
967244
965957
965620
962273
959585
958746
957932
954509
954182
953787
953564
960978
953398
952711
951940
951723
951718
997117
951684
950701
950427
950142
947925
945608
945038
943845
940838
938503
937972
937363
935123
934695
934474
934104
932214
932169
931204
931134
929173
928757
928353
928080
927100
926313
925557
923565
922353
920401
920226
919245
918184
917810
917078
956955
915491
914710
914655
912098
912089
911711
911703
910311
909373
909176
909133
908657
908256
906089
965852
905455
904716
902483
901149
900753
898585
897092
894842
894563
891966
890282
888169
967772
888154
887763
887337
887256
886571
886342
884893
884323
947764
899552
884112
884083
883767
882794
882480
880779
877747
877575
877144
885281
875958
913816
875725
875695
874771
874732
901816
916797
873477
880311
872853
872782
871958
978154
870255
869415
868148
865737
947583
861359
986443
861309
996397
860471
859435
858668
858591
874346
937459
858287
856647
854726
851789
849098
848449
994473
971933
907616
848275
848174
848150
848038
975687
967246
846520
846098
846017
845055
844165
844030
842825
932195
841629
840796
840042
876016
839727
837891
836549
835719
959036
834510
833934
832017
831917
831363
830340
905431
827604
827548
827153
827071
827055
827009
826911
824641
824515
823932
977006
936797
823673
823640
822158
822125
821822
821529
819437
819247
819183
818732
818666
817825
817290
817238
817128
850671
892107
836441
817048
816430
816179
921717
815710
815168
917957
814910
813595
813391
810055
808788
807728
816289
807480
952478
904919
807452
806731
804875
804739
803426
802322
802153
801906
801177
906704
800351
799868
799588
798883
797611
981415
797353
797047
797031
796183
795941
793905
792834
792728
792585
792520
789554
973391
789171
920851
788522
788390
785653
784847
783821
783404
914803
783312
780975
780715
780249
777970
777678
990003
949528
776516
776169
775615
775475
774338
772843
789738
771559
770466
770292
774935
769794
769303
769057
767218
765933
763463
860646
819255
784439
976381
763209
894031
762665
762220
761397
761036
760324
759001
758178
757930
757590
756015
847000
755460
858359
755198
754108
753386
751896
751767
751563
750578
999808
750431
749906
749367
749304
748948
748822
748632
748438
747337
880253
746292
746014
745614
744708
744350
914355
748198
777026
742720
742564
742211
989097
742166
903025
741976
740977
977854
737292
737078
736414
735694
733278
731875
730604
851915
729120
758795
727456
741166
727422
727410
727279
726709
726419
726364
725528
940845
725366
723143
723017
721672
921500
720893
719946
719385
982510
915460
779497
719310
718917
717375
716674
716241
714230
713806
712616
957572
874762
829566
823733
804955
772825
744140
767854
711606
708888
708870
983244
991724
880545
873084
707877
707626
707565
707445
707209
706223
993049
798558
792419
706088
808779
705731
705582
704243
703732
702629
699817
936700
905125
699711
695048
694319
692743
914876
692252
691982
691981
691067
690903
689365
689310
689035
699052
688810
688753
688114
687334
687163
686847
795604
712487
686495
685731
916899
685007
749460
681891
681368
736678
680857
680395
680162
679563
678472
677899
677531
704325
677414
677188
675386
675250
674760
824787
821948
820512
673572
673045
672618
672380
811369
671750
671546
713395
670932
669847
669700
668831
700912
668324
901811
948537
912895
851381
768183
667212
667042
916380
""", main)
