package net.gongmingqm10.exporter.util;

import net.gongmingqm10.exporter.model.Backing;
import net.gongmingqm10.exporter.model.Project;
import net.gongmingqm10.exporter.model.Series;
import net.gongmingqm10.exporter.model.Traffic;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void should_parse_backing_from_raw_line() throws Exception {
        String rawBacking = "\"2063069755\"|\"4957715\"|\"2016-04-13 07:43:08\"|\"created\"|\"90.00\"";

        Backing backing = Parser.transformRawBacking(rawBacking);

        assertNotNull(backing);
        assertEquals("2063069755", backing.getCode1());
        assertEquals("4957715", backing.getCode2());
        assertEquals(Parser.parseDate("2016-04-13 07:43:08"), backing.getLaunchedAt());
        assertEquals("created", backing.getStatus());
        assertTrue(90.00 - backing.getMoney() < 0.000001);
    }

    @Test
    public void should_parse_project_from_raw_line() throws Exception {
        String projectRaw = "\"1343894862\"|" +
                "\"1343894862\"|" +
                "\"2015-06-24 04:08:46\"|" +
                "\"2015-07-24 04:08:46\"|" +
                "\"720\"|" +
                "\"Age Past Dungeon Keep RPG Set\"|" +
                "\"age-past-dungeon-keep-rpg-set\"|" +
                "\"<h1><b>LETS TALK TABLE TOP RPG</b></h1><p>We\\n love our RPGs.  We think about creating new and exciting adventures.  \\nWe cradle the books and create wondrous altars devoted to them.  We \\ntravel to play and form lifelong friendships with others who also play. \\n We tell tales of our greatest characters and most epic feats.  We want \\nimmersion.</p><p>There have been lots of products made to help us achieve a deeper experience.</p><p>Those deep desires.  The perfect gaming solution is elusive...</p><p>There\\n has always been a disconnect.  RPGs are paper products, essentially \\nalways apart from the tabletop aspect of the game, and most accessories \\nare made from physical materials such as plastic and metal.  The same \\npeople making one are not usually great at making the other.  We have \\nseen many solutions, some good, some bad, and many are very expensive.  \\nWe need something new.  Something that works.  Something that anyone can\\n take anywhere he goes... but, it has to be elegant and sleek, and it \\nhas to work.  Something totally bacon.</p><h1>WELCOME TO DUNGEON KEEP</h1><div class=\"template asset\" data-edit_url=\"/projects/1625564009/1343894862/assets/3356591/edit\" data-id=\"3356591\"></div>\\n\\n<p>It\\n isn't a fancy name that inspires us, but in holding and touching \\nwonderful things that we form deep connections.  The Dungeon Keep RPG \\nSet allows you to do the following:</p><ul>\\n<li> Build Your Environment Quickly</li>\\n<li> Move What You Have Built Without Total Destruction</li>\\n<li> Build On Any Generally Flat Surface</li>\\n<li> Pack it up for Travel Easily</li>\\n<li> Completely Describe What You Need It To Be</li>\\n</ul><p>The\\n Dungeon Keep RPG Set allows the GM to create a game environment that is\\n portable, modular, and easy to use.  Interlocking segments have been \\ndesigned to keep your castle floor in place allowing the GM to add or \\nsubtract rooms easily.  Doors, windows, portals, columns, and statues \\ncan be added to add effect and detail to the areas.</p><p>Any\\n basic RPG building plans can be built.  As the adventurers move through\\n the structure, areas that have been skipped or left behind can be torn \\ndown and used to help build new areas.  If the party goes back those \\nareas can be quickly rebuilt again.  The interlocking pieces allow you \\nto slide your building over without it falling apart.</p><p>Another\\n great factor is it's portability.  Once broken down the entire kit \\neasily fits in a tackle box.  It is light-weight and easy to carry... \\nready to be set up once you reach your game spot.</p><h1>I NEED YOUR HELP</h1><p>Even though I am working with Daft Concepts on this project, I do not have a laser cutter.  Please help me to get my own laser, and in the future I can bring more great products directly.  Smaller commercial grade laser cutters cost around $6500 depending on size and options.  We need to get to about $9,000 to get there.  Thanks!./</p><h1><b>MATERIAL</b></h1>\\n<p>All\\n pieces are made from 1/8\" Baltic birch.  The wood etches beautifully \\nwith the laser and each line it creates .008\" (200 microns) thick.  It \\nis very durable and the dovetail slotting construction provides some \\nloose play, making non-standard shapes possible. </p><p>All pieces come completely cut out.  You have to spend no time punching stuff together.  There may be some short assembly, in regards to the stand ups.  It's cheaper to ship them un-assembled.</p><h1><b>WHAT IS THIS SET YOU SPEAK OF?</b></h1><div class=\"template asset\" data-edit_url=\"/projects/1625564009/1343894862/assets/3356597/edit\" data-id=\"3356597\"></div>\\n\\n<p>The Dungeon Keep RPG Set is broken into 6 parts.  Any or all of these \\nsets can be used together.  You are absolutely not required to purchase \\nmore than you need.  If you need a lot, then buy a lot.  If you already \\nlike your wall setup then the Stand Up Accessories might be the only \\nthing you need.  If you need to describe the items inside the rooms than\\n the Dungeon and Keep Token Sets are perfect for you.</p><div class=\"template asset\" data-edit_url=\"/projects/1625564009/1343894862/assets/3521484/edit\" data-id=\"3521484\"></div>\\n\\n<p>This\\n set is the heart of the system.  Included are 174 pieces and everything\\n you need to build one sizable floor or several smaller areas of a \\ndungeon, castle, bar, outhouse, tower, ruins, or palace.  Simply choose \\nwhat you want to build and then build it.  If all the pieces do not line\\n up, fear not!  Just simply overlap them.  Not all connections need to \\nbe made perfectly.  Remember speed is the key.  No player likes to sit \\naround waiting when she can be smashing an orc's face in with a morning \\nstar.</p><p>Every\\n piece is marked every one inch with a tick.  This means every standard \\nstraight piece is a tape measure of sorts.  You can cross reference a \\nhorizontal piece and a vertical piece to determine a location.  This \\nmakes requiring the use of grid papers obsolete.</p><div class=\"template asset\" data-edit_url=\"/projects/1625564009/1343894862/assets/3521514/edit\" data-id=\"3521514\"></div>\\n\\n<p>These walls are great if you don't want or need an interlocking feature.  They stand right up and and are beveled making angled areas east to create.  These walls also have ticks at every inch making each one a measurement tool as well.</p><p>They are extremely quit to setup and move around and work great with the Stand Up Accessory Option below.</p><div class=\"template asset\" data-edit_url=\"/projects/1625564009/1343894862/assets/3521515/edit\" data-id=\"3521515\"></div>\\n\\n<p>Regardless of where you are, at some point you needed to walk through a \\ndoor.  You saw where that door was and you went right through it.  Well \\nPC's need to know where doors are too.  These stand ups help illustrate \\nexactly where the doors, gates, windows, and magic portals are.  Just \\nplace any of the stand ups in its base and place the base right on a \\nwall section.  BOOM! Perfect visual description.  This is great way for a\\n sneaky rogue to choose the exact window she wishes to enter from.  \\nAssassination secured.</p><div class=\"template asset\" data-edit_url=\"/projects/1625564009/1343894862/assets/3356751/edit\" data-id=\"3356751\"></div>\\n\\n<p>These tokens are amazing visual descriptors of what is inside each room \\nof your dungeon.  There are two sets of tokens.  The dungeon set is \\ngeared toward basements, dilapidated structures, ruins, and anything old\\n or underground.  This includes kobold furniture. The pieces are range \\nin size from 6 inches square to one half inch square.  They are cleanly \\ncut and etched beautifully.  The lines come together nicely as \\neverything was designed in CAD.  Just place the tokens where you want to\\n see something and at once everyone know exactly what it is and where it\\n is.</p><div class=\"template asset\" data-edit_url=\"/projects/1625564009/1343894862/assets/3356756/edit\" data-id=\"3356756\"></div>\\n\\n<p>This\\n token set is geared toward more refined structures such as palaces, \\nnobles' residences, shops, and castles.  Effectively everything above \\nground.  This even includes bath tubs.  The pieces are range in size \\nfrom 6 inches square to one half inch square.  They are cleanly cut and \\netched beautifully.  The lines come together nicely as everything was \\ndesigned in CAD.  Just place the tokens where you want to see something \\nand at once everyone know exactly what it is and where it is.  There is \\nsome overlap between the sets, but not much.  Some common items are just\\n found all over.</p><div class=\"template asset\" data-edit_url=\"/projects/1625564009/1343894862/assets/3356645/edit\" data-id=\"3356645\"></div>\\n\\n<div class=\"template asset\" data-edit_url=\"/projects/1625564009/1343894862/assets/3360743/edit\" data-id=\"3360743\"></div>\\n\\n<div>\\n<p>If\\n you want modular ships, this set is for you.  The ships can form any \\nnumber of configurations or sizes.  If you choose the fleet option you \\ncan build one massive ship or four smaller ones.  The interlocking ship \\ncan be placed on material, such as vinyl, and slid around the table \\nforming awesome ship vs ship battles.  Plenty of cannons and a few other\\n accessories have been included as well.</p>\\n<h1>Comprehensive Example</h1>\\n<p>This example set shows what you can do with the Walls, Stand Ups, Dungeon, and Keep Token sets.  It is using about 85% of the Walls, 95% of the Keep Token Set, 95% of the Stand Up Set, and 50% of the Dungeon Token Set.</p>\\n<div class=\"template asset\" data-edit_url=\"/projects/1625564009/1343894862/assets/3521523/edit\" data-id=\"3521523\"></div>\\n\\n<div class=\"template asset\" data-edit_url=\"/projects/1625564009/1343894862/assets/3521525/edit\" data-id=\"3521525\"></div>\\n\\n<div class=\"template asset\" data-edit_url=\"/projects/1625564009/1343894862/assets/3521526/edit\" data-id=\"3521526\"></div>\\n\\n<h1>\\n<br>NEW DESIGNS</h1>\\n<p>It's hard to exactly know what everyone will like.  Luckily, the design effort in regards to laser cutting is flexible.  If you want to see something, I can definitely design it and get it prototyped in a week or so.  If more than a couple people request something I will be sure to add it in as an option.</p>\\n<p>Here are some things I am thinking of doing:</p>\\n<ul>\\n<li>Custom Laser Cut Box to Hold Your Bacon.</li>\\n<li>New Token Designs: more torture devices, tables...</li>\\n<li>New Wall Shapes:  \"S\" Turns, Weird connection pieces...</li>\\n</ul>\\n<h1>STAIN</h1>\\n<div class=\"template asset\" data-edit_url=\"/projects/1625564009/1343894862/assets/3732046/edit\" data-id=\"3732046\"></div>\\n\\n<p>With every set, choose one color.  It's free or keep the natural look.  We will stain both sides of the wood before cutting.  This is a wood stain and not a paint.  It is light in depth and allows the natural Baltic birch to show through.</p>\\n<h1><b>CONCLUSION</b></h1>\\n<p>The\\n Dungeon Keep RPG Set is a highly portable, customizable, elegant, and \\ncost effective way to add additional value to your gaming experience. </p>\\n</div><p>We\\n know you have choices and we appreciate you taking the time to check \\nout our new product.  I have been taking it to GenCon for the past 5 \\nyears running games and it always helps.  Even with the tight time frame\\n I am always able to setup and break down quickly.  The set has gone \\nthrough many iterations, 18 to be exact.  I wanted to ensure it was done\\n right.</p><p><b>VIDEOS</b></p><div class=\"template asset\" data-id=\"3360719\"></div>\\n\\n<div class=\"template asset\" data-id=\"3360740\"></div>\\n\\n<p><b>CAD SCHEMATICS</b></p><p>The proof is in the meticulous design.  Here are images of each set so you know what exactly comes in each set.</p><div class=\"template asset\" data-edit_url=\"/projects/1625564009/1343894862/assets/3348465/edit\" data-id=\"3348465\"></div>\\n\\n<div class=\"template asset\" data-edit_url=\"/projects/1625564009/1343894862/assets/3348473/edit\" data-id=\"3348473\"></div>\\n\\n<div class=\"template asset\" data-edit_url=\"/projects/1625564009/1343894862/assets/3402280/edit\" data-id=\"3402280\"></div>\\n\\n<div class=\"template asset\" data-edit_url=\"/projects/1625564009/1343894862/assets/3395717/edit\" data-id=\"3395717\"></div>\\n\\n<div class=\"template asset\" data-edit_url=\"/projects/1625564009/1343894862/assets/3395722/edit\" data-id=\"3395722\"></div>\\n\\n<div class=\"template asset\" data-edit_url=\"/projects/1625564009/1343894862/assets/3348488/edit\" data-id=\"3348488\"></div>\"|" +
                "\"Games\"|" +
                "\"US\"|" +
                "\"successful\"|" +
                "\"2176.00\"" +
                "|\"23\"" +
                "|\"1000.00\"" +
                "|\"1\"" +
                "|\"0\"|" +
                "\"0\"|" +
                "\"1\"|" +
                "\"3791.00\"|" +
                "\"3200.00\"|" +
                "\"72\"|" +
                "\"10\"|" +
                "\"385.00\"|" +
                "\"0\"|" +
                "\"1\"";
        Project project = Parser.transformRawProject(projectRaw);
        assertNotNull(project);

        assertEquals("1343894862", project.getCode1());
        assertEquals("1343894862", project.getCode2());
        assertEquals(Parser.parseDate("2015-06-24 04:08:46"), project.getLaunchFrom());
        assertEquals(Parser.parseDate("2015-07-24 04:08:46"), project.getLaunchTo());
        assertEquals(Integer.valueOf(720), project.getQuantity1());
        assertEquals("Age Past Dungeon Keep RPG Set", project.getTitle());
        assertEquals("age-past-dungeon-keep-rpg-set", project.getShortTitle());
        assertEquals("Games", project.getBusiness());
        assertEquals("US", project.getCountry());
        assertEquals("successful", project.getStatus());

        assertTrue(2176.00 - project.getAmount1() < 0.00001);
        assertEquals(Integer.valueOf(23), project.getQuantity2());
        assertTrue(1000.00 - project.getAmount2() < 0.00001);
        assertTrue(project.isFlag1());
        assertFalse(project.isFlag2());
        assertFalse(project.isFlag3());
        assertTrue(project.isFlag4());

        assertTrue(3791.00 - project.getAmount3() < 0.00001);
        assertTrue(3200.00 - project.getAmount4() < 0.00001);

        assertEquals(Integer.valueOf(72), project.getQuantity3());
        assertEquals(Integer.valueOf(10), project.getQuantity4());
        assertTrue(385.00 - project.getAmount5() < 0.00001);
        assertFalse(project.isFlag5());
        assertTrue(project.isFlag6());
    }

    @Test
    public void should_parse_series_from_raw_line() throws Exception {
        String rawSeries = "\"1021554757\"|\"2015-06-04 02:00:00\"|\"0\"|\"0.00\"|\"0\"|\"0\"|\"0\"|\"0\"|\"0\"|\"0\"|\"0\"|\"0\"";
        Series series = Parser.transformRawSeries(rawSeries);

        assertNotNull(series);
        assertEquals("1021554757", series.getCode1());
        assertEquals(Parser.parseDate("2015-06-04 02:00:00"), series.getLaunchedAt());
        assertEquals(Integer.valueOf(0), series.getQuantity1());
        assertTrue(0.00 - series.getAmount1() < 0.000001);
        assertEquals(Integer.valueOf(0), series.getQuantity2());
        assertEquals(Integer.valueOf(0), series.getQuantity3());
        assertEquals(Integer.valueOf(0), series.getQuantity4());
        assertEquals(Integer.valueOf(0), series.getQuantity5());
        assertEquals(Integer.valueOf(0), series.getQuantity6());
        assertEquals(Integer.valueOf(0), series.getQuantity7());
        assertEquals(Integer.valueOf(0), series.getQuantity8());
    }

    @Test
    public void should_parse_traffic_from_raw_line() throws Exception {
        String rawTraffic = "\"1676404360\"|\"2015-01-20 09:00:00\"|\"0.0001606728313323102\"|\"0\"|\"0\"|\"0\"|\"0\"|\"0\"|\"1.1080884919469669e-05\"|\"3.8783097218143838e-05\"|\"1.1080884919469669e-05\"|\"0\"|\"0\"|\"0\"|\"0\"|\"0\"|\"0\"|\"0\"|\"0\"|\"0\"|\"0\"|\"8.8647079355757351e-05\"|\"0\"|\"0\"|\"0\"|\"0\"|\"7.2025751976552847e-05\"|\"0\"|\"0\"|\"0\"|\"1.1080884919469669e-05\"|\"0.00014959194641284054\"|\"1.6621327379204504e-05\"|\"5.5404424597348344e-06\"|\"0.00013851106149337085\"|\"1.1080884919469669e-05\"|\"1.1080884919469669e-05\"";
        Traffic traffic = Parser.transformRawTraffic(rawTraffic);

        assertNotNull(traffic);
        assertEquals("1676404360", traffic.getCode1());
        assertTrue(0.0001606728313323102 - traffic.getAmount1() < 0.000000000001);
        assertTrue(0.00 - traffic.getAmount2() < 0.000000000001);
        assertTrue(0.00 - traffic.getAmount3() < 0.000000000001);
        assertTrue(0.00 - traffic.getAmount4() < 0.000000000001);
        assertTrue(0.00 - traffic.getAmount5() < 0.000000000001);
        assertTrue(0.00 - traffic.getAmount6() < 0.000000000001);
        assertTrue(1.1080884919469669e-05 - traffic.getAmount7() < 0.000000000001);
        assertTrue(3.8783097218143838e-05 - traffic.getAmount8() < 0.000000000001);
        assertTrue(1.1080884919469669e-05 - traffic.getAmount9() < 0.000000000001);

        assertTrue(0.00 - traffic.getAmount10() < 0.000000000001);
        assertTrue(0.00 - traffic.getAmount11() < 0.000000000001);
        assertTrue(0.00 - traffic.getAmount12() < 0.000000000001);
        assertTrue(0.00 - traffic.getAmount13() < 0.000000000001);
        assertTrue(0.00 - traffic.getAmount14() < 0.000000000001);
        assertTrue(0.00 - traffic.getAmount15() < 0.000000000001);
        assertTrue(0.00 - traffic.getAmount16() < 0.000000000001);
        assertTrue(0.00 - traffic.getAmount17() < 0.000000000001);
        assertTrue(0.00 - traffic.getAmount18() < 0.000000000001);
        assertTrue(0.00 - traffic.getAmount19() < 0.000000000001);

        assertTrue(8.8647079355757351e-05 - traffic.getAmount20() < 0.000000000001);

        assertTrue(0.00 - traffic.getAmount21() < 0.000000000001);
        assertTrue(0.00 - traffic.getAmount22() < 0.000000000001);
        assertTrue(0.00 - traffic.getAmount23() < 0.000000000001);
        assertTrue(0.00 - traffic.getAmount24() < 0.000000000001);
        assertTrue(7.2025751976552847e-05 - traffic.getAmount25() < 0.000000000001);

        assertTrue(0.00 - traffic.getAmount26() < 0.000000000001);
        assertTrue(0.00 - traffic.getAmount27() < 0.000000000001);
        assertTrue(0.00 - traffic.getAmount28() < 0.000000000001);
        assertTrue(1.1080884919469669e-05 - traffic.getAmount29() < 0.000000000001);
        assertTrue(0.00014959194641284054 - traffic.getAmount30() < 0.000000000001);
        assertTrue(1.6621327379204504e-05 - traffic.getAmount31() < 0.000000000001);
        assertTrue(5.5404424597348344e-06 - traffic.getAmount32() < 0.000000000001);
        assertTrue(0.00013851106149337085 - traffic.getAmount33() < 0.000000000001);
        assertTrue(1.1080884919469669e-05 - traffic.getAmount34() < 0.000000000001);
        assertTrue(1.1080884919469669e-05 - traffic.getAmount35() < 0.000000000001);
    }
}