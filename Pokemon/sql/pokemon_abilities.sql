CREATE DATABASE  IF NOT EXISTS `pokemon` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `pokemon`;
-- MySQL dump 10.13  Distrib 5.6.24, for Win64 (x86_64)
--
-- Host: localhost    Database: pokemon
-- ------------------------------------------------------
-- Server version	5.6.26-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `abilities`
--

DROP TABLE IF EXISTS `abilities`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `abilities` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `descript` varchar(75) DEFAULT NULL,
  `gen` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=191 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `abilities`
--

LOCK TABLES `abilities` WRITE;
/*!40000 ALTER TABLE `abilities` DISABLE KEYS */;
INSERT INTO `abilities` VALUES (1,'Adaptability','Powers up moves of the same type.',4),(2,'Aerilate','Turns Normal-type moves into Flying-type moves.',6),(3,'Aftermath','Damages the attacker landing the finishing hit.',4),(4,'Air Lock','Eliminates the effects of weather.',3),(5,'Analytic','Boosts move power when the Pokémon moves last.',5),(6,'Anger Point','Maxes Attack after taking a critical hit.',4),(7,'Anticipation','Senses a foe\'s dangerous moves.',4),(8,'Arena Trap','Prevents the foe from fleeing.',3),(9,'Aroma Veil','Protects allies from attacks that limit their move choices.',6),(10,'Aura Break','The effects of “Aura” Abilities are reversed.',6),(11,'Bad Dreams','Reduces a sleeping foe\'s HP.',4),(12,'Battle Armor','The Pokémon is protected against critical hits.',3),(13,'Big Pecks','Protects the Pokémon from Defense-lowering attacks.',5),(14,'Blaze','Powers up Fire-type moves in a pinch.',3),(15,'Bulletproof','Protects the Pokémon from ball and bomb moves.',6),(16,'Cheek Pouch','Restores additional HP when a Berry is consumed.',6),(17,'Chlorophyll','Boosts the Pokémon\'s Speed in sunshine.',3),(18,'Clear Body','Prevents other Pokémon from lowering its stats.',3),(19,'Cloud Nine','Eliminates the effects of weather.',3),(20,'Color Change','Changes the Pokémon\'s type to the foe\'s move.',3),(21,'Competitive','Raises Special Attack when the Pokémon\'s stats are lowered.',6),(22,'Compound Eyes','The Pokémon\'s accuracy is boosted.',3),(23,'Contrary','Makes stat changes have an opposite effect.',5),(24,'Cursed Body','May disable a move used on the Pokémon.',5),(25,'Cute Charm','Contact with the Pokémon may cause infatuation.',3),(26,'Damp','Prevents the use of self-destructing moves.',3),(27,'Dark Aura','Raises power of Dark type moves for all Pokémon in battle.',6),(28,'Defeatist','Lowers stats when HP becomes half or less.',5),(29,'Defiant','When its stats are lowered its Attack increases.',5),(30,'Delta Stream','Creates strong winds when the ability activates.',6),(31,'Desolate Land','Turns the sunlight extremely harsh when the ability activates.',6),(32,'Download','Adjusts power according to a foe\'s defenses.',4),(33,'Drizzle','The Pokémon makes it rain when it enters a battle.',3),(34,'Drought','Turns the sunlight harsh when the Pokémon enters a battle.',3),(35,'Dry Skin','Reduces HP if it is hot. Water restores HP.',4),(36,'Early Bird','The Pokémon awakens quickly from sleep.',3),(37,'Effect Spore','Contact may poison or cause paralysis or sleep.',3),(38,'Fairy Aura','Raises power of Fairy type moves for all Pokémon in battle.',6),(39,'Filter','Reduces damage from supereffective attacks.',4),(40,'Flame Body','Contact with the Pokémon may burn the attacker.',3),(41,'Flare Boost','Powers up special attacks when burned.',5),(42,'Flash Fire','It powers up Fire-type moves if it\'s hit by one.',3),(43,'Flower Gift','Powers up party Pokémon when it is sunny.',4),(44,'Flower Veil','Prevents lowering of ally Grass-type Pokémon\'s stats.',6),(45,'Forecast','Castform transforms with the weather.',3),(46,'Forewarn','Determines what moves a foe has.',4),(47,'Friend Guard','Reduces damage done to allies.',5),(48,'Frisk','The Pokémon can check a foe\'s held item.',4),(49,'Fur Coat','Reduces damage from physical moves.',6),(50,'Gale Wings','Gives priority to Flying-type moves.',6),(51,'Gluttony','Encourages the early use of a held Berry.',4),(52,'Gooey','Contact with the Pokémon lowers the attacker\'s Speed stat.',6),(53,'Grass Pelt','Boosts the Defense stat in Grassy Terrain.',6),(54,'Guts','Boosts Attack if there is a status problem.',3),(55,'Harvest','May create another Berry after one is used.',5),(56,'Healer','May heal an ally\'s status conditions.',5),(57,'Heatproof','Weakens the power of Fire-type moves.',4),(58,'Heavy Metal','Doubles the Pokémon\'s weight.',5),(59,'Honey Gather','The Pokémon may gather Honey from somewhere.',4),(60,'Huge Power','Raises the Pokémon\'s Attack stat.',3),(61,'Hustle','Boosts the Attack stat, but lowers accuracy.',3),(62,'Hydration','Heals status problems if it is raining.',4),(63,'Hyper Cutter','Prevents other Pokémon from lowering Attack stat.',3),(64,'Ice Body','The Pokémon gradually regains HP in a hailstorm.',4),(65,'Illuminate','Raises the likelihood of meeting wild Pokémon.',3),(66,'Illusion','Comes out disguised as the Pokémon in back.',5),(67,'Immunity','Prevents the Pokémon from getting poisoned.',3),(68,'Imposter','It transforms itself into the Pokémon it is facing.',5),(69,'Infiltrator','Passes through the foe\'s barrier and strikes.',5),(70,'Inner Focus','The Pokémon is protected from flinching.',3),(71,'Insomnia','Prevents the Pokémon from falling asleep.',3),(72,'Intimidate','Lowers the foe\'s Attack stat.',3),(73,'Iron Barbs','Inflicts damage to the Pokémon on contact.',5),(74,'Iron Fist','Boosts the power of punching moves.',4),(75,'Justified','Raises Attack when hit by a Dark-type move.',5),(76,'Keen Eye','Prevents other Pokémon from lowering accuracy.',3),(77,'Klutz','The Pokémon can\'t use any held items.',4),(78,'Leaf Guard','Prevents problems with status in sunny weather.',4),(79,'Levitate','Gives immunity to Ground type moves.',3),(80,'Light Metal','Halves the Pokémon\'s weight.',5),(81,'Lightning Rod','Draws in all Electric-type moves to up Sp. Attack.',3),(82,'Limber','The Pokémon is protected from paralysis.',3),(83,'Liquid Ooze','Damages attackers using any draining move.',3),(84,'Magic Bounce','Reflects status- changing moves.',5),(85,'Magic Guard','The Pokémon only takes damage from attacks.',4),(86,'Magician','The Pokémon steals the held item of a Pokémon it hits with a move.',6),(87,'Magma Armor','Prevents the Pokémon from becoming frozen.',3),(88,'Magnet Pull','Prevents Steel-type Pokémon from escaping.',3),(89,'Marvel Scale','Ups Defense if there is a status problem.',3),(90,'Mega Launcher','Boosts the power of aura and pulse moves.',6),(91,'Minus','Ups Sp. Atk if another Pokémon has Plus or Minus.',3),(92,'Mold Breaker','Moves can be used regardless of Abilities.',4),(93,'Moody','Raises one stat and lowers another.',5),(94,'Motor Drive','Raises Speed if hit by an Electric-type move.',4),(95,'Moxie','Boosts Attack after knocking out any Pokémon.',5),(96,'Multiscale','Reduces damage when HP is full.',5),(97,'Multitype','Changes type to match the held Plate.',4),(98,'Mummy','Contact with this Pokémon spreads this Ability.',5),(99,'Natural Cure','All status problems heal when it switches out.',3),(100,'No Guard','Ensures attacks by or against the Pokémon land.',4),(101,'Normalize','All the Pokémon\'s moves become the Normal type.',4),(102,'Oblivious','Prevents it from becoming infatuated.',3),(103,'Overcoat','Protects the Pokémon from damage from weather.',5),(104,'Overgrow','Powers up Grass-type moves in a pinch.',3),(105,'Own Tempo','Prevents the Pokémon from becoming confused.',3),(106,'Parental Bond','Allows the Pokémon to attack twice.',6),(107,'Pickpocket','Steals an item when hit by another Pokémon.',5),(108,'Pickup','The Pokémon may pick up items.',3),(109,'Pixilate','Turns Normal-type moves into Fairy-type moves.',6),(110,'Plus','Ups Sp. Atk if another Pokémon has Plus or Minus.',3),(111,'Poison Heal','Restores HP if the Pokémon is poisoned.',4),(112,'Poison Point','Contact with the Pokémon may poison the attacker.',3),(113,'Poison Touch','May poison targets when a Pokémon makes contact.',5),(114,'Prankster','Gives priority to a status move.',5),(115,'Pressure','The Pokémon raises the foe\'s PP usage.',3),(116,'Primordial Sea','Makes it rain heavily when the ability activates.',6),(117,'Protean','Changes the Pokémon\'s type to its last used move.',6),(118,'Pure Power','Raises the Pokémon\'s Attack stat.',3),(119,'Quick Feet','Boosts Speed if there is a status problem.',4),(120,'Rain Dish','The Pokémon gradually regains HP in rain.',3),(121,'Rattled','Bug, Ghost or Dark type moves scare it and boost its Speed.',5),(122,'Reckless','Powers up moves that have recoil damage.',4),(123,'Refrigerate','Turns Normal-type moves into Ice-type moves.',6),(124,'Regenerator','Restores a little HP when withdrawn from battle.',5),(125,'Rivalry','Deals more damage to a Pokémon of same gender.',4),(126,'Rock Head','Protects the Pokémon from recoil damage.',3),(127,'Rough Skin','Inflicts damage to the attacker on contact.',3),(128,'Run Away','Enables a sure getaway from wild Pokémon.',3),(129,'Sand Force','Boosts certain moves\' power in a sandstorm.',5),(130,'Sand Rush','Boosts the Pokémon\'s Speed in a sandstorm.',5),(131,'Sand Stream','The Pokémon summons a sandstorm in battle.',3),(132,'Sand Veil','Boosts the Pokémon\'s evasion in a sandstorm.',3),(133,'Sap Sipper','Boosts Attack when hit by a Grass-type move.',5),(134,'Scrappy','Enables moves to hit Ghost-type Pokémon.',4),(135,'Serene Grace','Boosts the likelihood of added effects appearing.',3),(136,'Shadow Tag','Prevents the foe from escaping.',3),(137,'Shed Skin','The Pokémon may heal its own status problems.',3),(138,'Sheer Force','Removes added effects to increase move damage.',5),(139,'Shell Armor','The Pokémon is protected against critical hits.',3),(140,'Shield Dust','Blocks the added effects of attacks taken.',3),(141,'Simple','Doubles all stat changes.',4),(142,'Skill Link','Increases the frequency of multi-strike moves.',4),(143,'Slow Start','Temporarily halves Attack and Speed.',4),(144,'Sniper','Powers up moves if they become critical hits.',4),(145,'Snow Cloak','Raises evasion in a hailstorm.',4),(146,'Snow Warning','The Pokémon summons a hailstorm in battle.',4),(147,'Solar Power','In sunshine, Sp. Atk is boosted but HP decreases.',4),(148,'Solid Rock','Reduces damage from supereffective attacks.',4),(149,'Soundproof','Gives immunity to sound-based moves.',3),(150,'Speed Boost','Its Speed stat is gradually boosted.',3),(151,'Stall','The Pokémon moves after all other Pokémon do.',4),(152,'Stance Change','Changes form depending on moves used.',6),(153,'Static','Contact with the Pokémon may cause paralysis.',3),(154,'Steadfast','Raises Speed each time the Pokémon flinches.',4),(155,'Stench','The stench may cause the target to flinch.',3),(156,'Sticky Hold','Protects the Pokémon from item theft.',3),(157,'Storm Drain','Draws in all Water-type moves to up Sp. Attack.',4),(158,'Strong Jaw','Boosts the power of biting moves.',6),(159,'Sturdy','It cannot be knocked out with one hit.',3),(160,'Suction Cups','Negates all moves that force switching out.',3),(161,'Super Luck','Heightens the critical-hit ratios of moves.',4),(162,'Swarm','Powers up Bug-type moves in a pinch.',3),(163,'Sweet Veil','Prevents the Pokémon and allies from falling asleep.',6),(164,'Swift Swim','Boosts the Pokémon\'s Speed in rain.',3),(165,'Symbiosis','The Pokémon can pass an item to an ally.',6),(166,'Synchronize','Passes a burn, poison, or paralysis to the foe.',3),(167,'Tangled Feet','Raises evasion if the Pokémon is confused.',4),(168,'Technician','Powers up the Pokémon\'s weaker moves.',4),(169,'Telepathy','Anticipates an ally\'s attack and dodges it.',5),(170,'Teravolt','Moves can be used regardless of Abilities.',5),(171,'Thick Fat','Ups resistance to Fire- and Ice-type moves.',3),(172,'Tinted Lens','Powers up “not very effective” moves.',4),(173,'Torrent','Powers up Water-type moves in a pinch.',3),(174,'Tough Claws','Boosts the power of contact moves.',6),(175,'Toxic Boost','Powers up physical attacks when poisoned.',5),(176,'Trace','The Pokémon copies a foe\'s Ability.',3),(177,'Truant','Pokémon can\'t attack on consecutive turns.',3),(178,'Turboblaze','Moves can be used regardless of Abilities.',5),(179,'Unaware','Ignores any stat changes in the Pokémon.',4),(180,'Unburden','Raises Speed if a held item is used.',4),(181,'Unnerve','Makes the foe nervous and unable to eat Berries.',5),(182,'Victory Star','Boosts the accuracy of its allies and itself.',5),(183,'Vital Spirit','Prevents the Pokémon from falling asleep.',3),(184,'Volt Absorb','Restores HP if hit by an Electric-type move.',3),(185,'Water Absorb','Restores HP if hit by a Water-type move.',3),(186,'Water Veil','Prevents the Pokémon from getting a burn.',3),(187,'Weak Armor','Physical attacks lower Defense and raise Speed.',5),(188,'White Smoke','Prevents other Pokémon from lowering its stats.',3),(189,'Wonder Guard','Only supereffective moves will hit.',3),(190,'Wonder Skin','Makes status-changing moves more likely to miss.',5);
/*!40000 ALTER TABLE `abilities` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-12-04 19:08:32
