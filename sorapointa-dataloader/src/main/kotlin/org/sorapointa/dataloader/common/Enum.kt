@file:Suppress("unused")

package org.sorapointa.dataloader.common

enum class SceneType(val value: Int) {
    SCENE_NONE(0),
    SCENE_WORLD(1),
    SCENE_DUNGEON(2),
    SCENE_ROOM(3),
    SCENE_HOME_WORLD(4),
    SCENE_HOME_ROOM(5),
    SCENE_ACTIVITY(6)
}

enum class EquipType(val value: Int) {
    EQUIP_NONE(0),
    EQUIP_BRACER(1), // Flower of Life 生之花
    EQUIP_NECKLACE(2), // Plume of Death 死之羽
    EQUIP_SHOES(3), // Sands of Eon 时之沙
    EQUIP_RING(4), // Goblet of Eonothem 空之杯
    EQUIP_DRESS(5), // Circlet of Logos 理之冠
    EQUIP_WEAPON(6)
}

enum class FlyCloakId(_id: Int) {
    GLIDER(1),
    STARLIT(2),
    PSALMUS(3),
    GALE(4),
    MEGALITH(5),
    NIXAVIS(6),
    REDCOMET(7),
    THUNDERCLAP(8),
    SKALD(9),
    ;

    val id = _id + 140000
}

enum class EntityIdType(val value: Int) {
    AVATAR(1),
    MONSTER(2),
    NPC(3),
    GADGET(4),
    WEAPON(6),
    TEAM(9),
    MPLEVEL(11);
}

enum class ClimateType(val value: Int) {
    CLIMATE_NONE(0),
    CLIMATE_SUNNY(1),
    CLIMATE_CLOUDY(2),
    CLIMATE_RAIN(3),
    CLIMATE_THUNDERSTORM(4),
    CLIMATE_SNOW(5),
    CLIMATE_MIST(6)
}

enum class EntityAppearVisionType(val value: Int) {
    VISION_NONE(0),
    VISION_MEET(1),
    VISION_REBORN(2),
    VISION_REPLACE(3),
    VISION_WAYPOINT_REBORN(4),
    VISION_MISS(5),
    VISION_DIE(6),
    VISION_GATHER_ESCAPE(7),
    VISION_REFRESH(8),
    VISION_TRANSPORT(9),
    VISION_REPLACE_DIE(10)
}

enum class LifeState(val value: Int) {
    LIFE_NONE(0),
    LIFE_ALIVE(1),
    LIFE_DEAD(2),
    LIFE_REVIVE(3)
}

enum class AvatarType(val value: Int) {
    NONE(0),
    FORMAL(1),
    TRIAL(2),
    MIRROR(3)
}

enum class ElementType(
    val value: Int,
    val curEnergyProp: FightProp,
    val maxEnergyProp: FightProp
) {
    None(0, FightProp.FIGHT_PROP_CUR_FIRE_ENERGY, FightProp.FIGHT_PROP_MAX_FIRE_ENERGY),
    Fire(1, FightProp.FIGHT_PROP_CUR_FIRE_ENERGY, FightProp.FIGHT_PROP_MAX_FIRE_ENERGY),
    Water(2, FightProp.FIGHT_PROP_CUR_WATER_ENERGY, FightProp.FIGHT_PROP_MAX_WATER_ENERGY),
    Grass(3, FightProp.FIGHT_PROP_CUR_GRASS_ENERGY, FightProp.FIGHT_PROP_MAX_GRASS_ENERGY),
    Electric(4, FightProp.FIGHT_PROP_CUR_ELEC_ENERGY, FightProp.FIGHT_PROP_MAX_ELEC_ENERGY),
    Ice(5, FightProp.FIGHT_PROP_CUR_ICE_ENERGY, FightProp.FIGHT_PROP_MAX_ICE_ENERGY),
    // Frozen Element 冻元素, Water + Ice = Frozen, (Water or Ice) + Frozen = Nothing
    Frozen(6, FightProp.FIGHT_PROP_CUR_ICE_ENERGY, FightProp.FIGHT_PROP_MAX_ICE_ENERGY),
    Wind(7, FightProp.FIGHT_PROP_CUR_WIND_ENERGY, FightProp.FIGHT_PROP_MAX_WIND_ENERGY),
    Rock(8, FightProp.FIGHT_PROP_CUR_ROCK_ENERGY, FightProp.FIGHT_PROP_MAX_ROCK_ENERGY),
    // Questionable ?: Combustion Element 燃元素, Fire + Grass = Combustion
    AntiFire(9, FightProp.FIGHT_PROP_CUR_FIRE_ENERGY, FightProp.FIGHT_PROP_MAX_FIRE_ENERGY),
    // VehicleMuteIce, COUNT, wtf is that?
}

enum class OpenState(val value: Int) {
    OPEN_STATE_NONE(0),
    OPEN_STATE_PAIMON(1),
    OPEN_STATE_PAIMON_NAVIGATION(2),
    OPEN_STATE_AVATAR_PROMOTE(3),
    OPEN_STATE_AVATAR_TALENT(4),
    OPEN_STATE_WEAPON_PROMOTE(5),
    OPEN_STATE_WEAPON_AWAKEN(6),
    OPEN_STATE_QUEST_REMIND(7),
    OPEN_STATE_GAME_GUIDE(8),
    OPEN_STATE_COOK(9),
    OPEN_STATE_WEAPON_UPGRADE(10),
    OPEN_STATE_RELIQUARY_UPGRADE(11),
    OPEN_STATE_RELIQUARY_PROMOTE(12),
    OPEN_STATE_WEAPON_PROMOTE_GUIDE(13),
    OPEN_STATE_WEAPON_CHANGE_GUIDE(14),
    OPEN_STATE_PLAYER_LVUP_GUIDE(15),
    OPEN_STATE_FRESHMAN_GUIDE(16),
    OPEN_STATE_SKIP_FRESHMAN_GUIDE(17),
    OPEN_STATE_GUIDE_MOVE_CAMERA(18),
    OPEN_STATE_GUIDE_SCALE_CAMERA(19),
    OPEN_STATE_GUIDE_KEYBOARD(20),
    OPEN_STATE_GUIDE_MOVE(21),
    OPEN_STATE_GUIDE_JUMP(22),
    OPEN_STATE_GUIDE_SPRINT(23),
    OPEN_STATE_GUIDE_MAP(24),
    OPEN_STATE_GUIDE_ATTACK(25),
    OPEN_STATE_GUIDE_FLY(26),
    OPEN_STATE_GUIDE_TALENT(27),
    OPEN_STATE_GUIDE_RELIC(28),
    OPEN_STATE_GUIDE_RELIC_PROM(29),
    OPEN_STATE_COMBINE(30),
    OPEN_STATE_GACHA(31),
    OPEN_STATE_GUIDE_GACHA(32),
    OPEN_STATE_GUIDE_TEAM(33),
    OPEN_STATE_GUIDE_PROUD(34),
    OPEN_STATE_GUIDE_AVATAR_PROMOTE(35),
    OPEN_STATE_GUIDE_ADVENTURE_CARD(36),
    OPEN_STATE_FORGE(37),
    OPEN_STATE_GUIDE_BAG(38),
    OPEN_STATE_EXPEDITION(39),
    OPEN_STATE_GUIDE_ADVENTURE_DAILYTASK(40),
    OPEN_STATE_GUIDE_ADVENTURE_DUNGEON(41),
    OPEN_STATE_TOWER(42),
    OPEN_STATE_WORLD_STAMINA(43),
    OPEN_STATE_TOWER_FIRST_ENTER(44),
    OPEN_STATE_RESIN(45),
    OPEN_STATE_LIMIT_REGION_FRESHMEAT(47),
    OPEN_STATE_LIMIT_REGION_GLOBAL(48),
    OPEN_STATE_MULTIPLAYER(49),
    OPEN_STATE_GUIDE_MOUSEPC(50),
    OPEN_STATE_GUIDE_MULTIPLAYER(51),
    OPEN_STATE_GUIDE_DUNGEONREWARD(52),
    OPEN_STATE_GUIDE_BLOSSOM(53),
    OPEN_STATE_AVATAR_FASHION(54),
    OPEN_STATE_PHOTOGRAPH(55),
    OPEN_STATE_GUIDE_KSLQUEST(56),
    OPEN_STATE_PERSONAL_LINE(57),
    OPEN_STATE_GUIDE_PERSONAL_LINE(58),
    OPEN_STATE_GUIDE_APPEARANCE(59),
    OPEN_STATE_GUIDE_PROCESS(60),
    OPEN_STATE_GUIDE_PERSONAL_LINE_KEY(61),
    OPEN_STATE_GUIDE_WIDGET(62),
    OPEN_STATE_GUIDE_ACTIVITY_SKILL_ASTER(63),
    OPEN_STATE_GUIDE_COLDCLIMATE(64),
    OPEN_STATE_DERIVATIVE_MALL(65),
    OPEN_STATE_GUIDE_EXITMULTIPLAYER(66),
    OPEN_STATE_GUIDE_THEATREMACHANICUS_BUILD(67),
    OPEN_STATE_GUIDE_THEATREMACHANICUS_REBUILD(68),
    OPEN_STATE_GUIDE_THEATREMACHANICUS_CARD(69),
    OPEN_STATE_GUIDE_THEATREMACHANICUS_MONSTER(70),
    OPEN_STATE_GUIDE_THEATREMACHANICUS_MISSION_CHECK(71),
    OPEN_STATE_GUIDE_THEATREMACHANICUS_BUILD_SELECT(72),
    OPEN_STATE_GUIDE_THEATREMACHANICUS_CHALLENGE_START(73),
    OPEN_STATE_GUIDE_CONVERT(74),
    OPEN_STATE_GUIDE_THEATREMACHANICUS_MULTIPLAYER(75),
    OPEN_STATE_GUIDE_COOP_TASK(76),
    OPEN_STATE_GUIDE_HOMEWORLD_ADEPTIABODE(77),
    OPEN_STATE_GUIDE_HOMEWORLD_DEPLOY(78),
    OPEN_STATE_GUIDE_CHANNELLERSLAB_EQUIP(79),
    OPEN_STATE_GUIDE_CHANNELLERSLAB_MP_SOLUTION(80),
    OPEN_STATE_GUIDE_CHANNELLERSLAB_POWER(81),
    OPEN_STATE_GUIDE_HIDEANDSEEK_SKILL(82),
    OPEN_STATE_GUIDE_HOMEWORLD_MAPLIST(83),
    OPEN_STATE_GUIDE_RELICRESOLVE(84),
    OPEN_STATE_GUIDE_GGUIDE(85),
    OPEN_STATE_GUIDE_GGUIDE_HINT(86),
    OPEN_STATE_GUIDE_QUICK_TEAMMEMBERCHANGE(90),
    OPEN_STATE_GGUIDE_FIRSTSHOW(91),
    OPEN_STATE_GGUIDE_MAINPAGE_ENTRY_DISAPPEAR(92),
    OPEN_STATE_CITY_REPUATION_MENGDE(800),
    OPEN_STATE_CITY_REPUATION_LIYUE(801),
    OPEN_STATE_CITY_REPUATION_UI_HINT(802),
    OPEN_STATE_CITY_REPUATION_INAZUMA(803),
    OPEN_STATE_SHOP_TYPE_MALL(900),
    OPEN_STATE_SHOP_TYPE_RECOMMANDED(901),
    OPEN_STATE_SHOP_TYPE_GENESISCRYSTAL(902),
    OPEN_STATE_SHOP_TYPE_GIFTPACKAGE(903),
    OPEN_STATE_SHOP_TYPE_PAIMON(1001),
    OPEN_STATE_SHOP_TYPE_CITY(1002),
    OPEN_STATE_SHOP_TYPE_BLACKSMITH(1003),
    OPEN_STATE_SHOP_TYPE_GROCERY(1004),
    OPEN_STATE_SHOP_TYPE_FOOD(1005),
    OPEN_STATE_SHOP_TYPE_SEA_LAMP(1006),
    OPEN_STATE_SHOP_TYPE_VIRTUAL_SHOP(1007),
    OPEN_STATE_SHOP_TYPE_LIYUE_GROCERY(1008),
    OPEN_STATE_SHOP_TYPE_LIYUE_SOUVENIR(1009),
    OPEN_STATE_SHOP_TYPE_LIYUE_RESTAURANT(1010),
    OPEN_STATE_SHOP_TYPE_INAZUMA_SOUVENIR(1011),
    OPEN_STATE_SHOP_TYPE_NPC_TOMOKI(1012),
    OPEN_STATE_SHOP_TYPE_INAZUMA_SOUVENIR_BLACK_BAR(1013),
    OPEN_ADVENTURE_MANUAL(1100),
    OPEN_ADVENTURE_MANUAL_CITY_MENGDE(1101),
    OPEN_ADVENTURE_MANUAL_CITY_LIYUE(1102),
    OPEN_ADVENTURE_MANUAL_MONSTER(1103),
    OPEN_ADVENTURE_MANUAL_BOSS_DUNGEON(1104),
    OPEN_STATE_ACTIVITY_SEALAMP(1200),
    OPEN_STATE_BATTLE_PASS(1300),
    OPEN_STATE_BATTLE_PASS_ENTRY(1301),
    OPEN_STATE_ACTIVITY_CRUCIBLE(1400),
    OPEN_STATE_ACTIVITY_NEWBEEBOUNS_OPEN(1401),
    OPEN_STATE_ACTIVITY_NEWBEEBOUNS_CLOSE(1402),
    OPEN_STATE_ACTIVITY_ENTRY_OPEN(1403),
    OPEN_STATE_MENGDE_INFUSEDCRYSTAL(1404),
    OPEN_STATE_LIYUE_INFUSEDCRYSTAL(1405),
    OPEN_STATE_SNOW_MOUNTAIN_ELDER_TREE(1406),
    OPEN_STATE_MIRACLE_RING(1407),
    OPEN_STATE_COOP_LINE(1408),
    OPEN_STATE_INAZUMA_INFUSEDCRYSTAL(1409),
    OPEN_STATE_FISH(1410),
    OPEN_STATE_GUIDE_SUMO_TEAM_SKILL(1411),
    OPEN_STATE_GUIDE_FISH_RECIPE(1412),
    OPEN_STATE_HOME(1500),
    OPEN_STATE_ACTIVITY_HOMEWORLD(1501),
    OPEN_STATE_ADEPTIABODE(1502),
    OPEN_STATE_HOME_AVATAR(1503),
    OPEN_STATE_HOME_EDIT(1504),
    OPEN_STATE_HOME_EDIT_TIPS(1505),
    OPEN_STATE_RELIQUARY_DECOMPOSE(1600),
    OPEN_STATE_ORAIONOKAMI(2000),
    OPEN_STATE_GUIDE_CHESS_MISSION_CHECK(2001),
    OPEN_STATE_GUIDE_CHESS_BUILD(2002),
    OPEN_STATE_GUIDE_CHESS_WIND_TOWER_CIRCLE(2003),
    OPEN_STATE_GUIDE_CHESS_CARD_SELECT(2004),
    OPEN_STATE_INAZUMA_MAINQUEST_FINISHED(2005),
    OPEN_STATE_PAIMON_LVINFO(2100),
    OPEN_STATE_TELEPORT_HUD(2101),
    OPEN_STATE_GUIDE_MAP_UNLOCK(2102),
    OPEN_STATE_GUIDE_PAIMON_LVINFO(2103),
    OPEN_STATE_GUIDE_AMBORTRANSPORT(2104),
    OPEN_STATE_GUIDE_FLY_SECOND(2105),
    OPEN_STATE_GUIDE_KAEYA_CLUE(2106),
    OPEN_STATE_CAPTURE_CODEX(2107),
    OPEN_STATE_ACTIVITY_FISH_OPEN(2200),
    OPEN_STATE_ACTIVITY_FISH_CLOSE(2201),
    OPEN_STATE_GUIDE_ROGUE_MAP(2205),
    OPEN_STATE_GUIDE_ROGUE_RUNE(2206),
    OPEN_STATE_GUIDE_BARTENDER_FORMULA(2210),
    OPEN_STATE_GUIDE_BARTENDER_MIX(2211),
    OPEN_STATE_GUIDE_BARTENDER_CUP(2212),
    OPEN_STATE_GUIDE_MAIL_FAVORITES(2400),
    OPEN_STATE_GUIDE_POTION_CONFIGURE(2401),
    OPEN_STATE_LOADINGTIPS_ENKANOMIYA(2403),
    OPEN_STATE_MICHIAE_CASKET(2500),
    OPEN_STATE_MAIL_COLLECT_UNLOCK_RED_POINT(2501),
    OPEN_STATE_LUMEN_STONE(2600),
    OPEN_STATE_GUIDE_CRYSTALLINK_BUFF(2601),
    OPEN_STATE_GUIDE_ROBOTGACHA(2704),
    OPEN_STATE_GUIDE_FRAGILE_RESIN(2800),
    OPEN_ADVENTURE_MANUAL_EDUCATION(2801),
}

interface PropEnum {
    val value: Int
}

/**
 * ```json
 * {
 *     "FIGHT_PROP_MAX_HP": "生命值上限",
 *     "FIGHT_PROP_ATTACK": "攻击力",
 *     "FIGHT_PROP_DEFENSE": "防御力",
 *     "FIGHT_PROP_ELEMENT_MASTERY": "元素精通",
 *     "FIGHT_PROP_CRITICAL": "暴击率",
 *     "FIGHT_PROP_CRITICAL_HURT": "暴击伤害",
 *     "FIGHT_PROP_HEAL_ADD": "治疗加成",
 *     "FIGHT_PROP_HEALED_ADD": "受治疗加成",
 *     "FIGHT_PROP_CHARGE_EFFICIENCY": "元素充能效率",
 *     "FIGHT_PROP_SHIELD_COST_MINUS_RATIO": "护盾强效",
 *     "FIGHT_PROP_FIRE_ADD_HURT": "火元素伤害加成",
 *     "FIGHT_PROP_WATER_ADD_HURT": "水元素伤害加成",
 *     "FIGHT_PROP_GRASS_ADD_HURT": "草元素伤害加成",
 *     "FIGHT_PROP_ELEC_ADD_HURT": "雷元素伤害加成",
 *     "FIGHT_PROP_WIND_ADD_HURT": "风元素伤害加成",
 *     "FIGHT_PROP_ICE_ADD_HURT": "冰元素伤害加成",
 *     "FIGHT_PROP_ROCK_ADD_HURT": "岩元素伤害加成",
 *     "FIGHT_PROP_PHYSICAL_ADD_HURT": "物理伤害加成"
 * }
 * ```
 */
enum class FightProp(override val value: Int) : PropEnum {
    FIGHT_PROP_NONE(0),
    FIGHT_PROP_BASE_HP(1),
    FIGHT_PROP_HP(2),
    FIGHT_PROP_HP_PERCENT(3),
    FIGHT_PROP_BASE_ATTACK(4),
    FIGHT_PROP_ATTACK(5),
    FIGHT_PROP_ATTACK_PERCENT(6),
    FIGHT_PROP_BASE_DEFENSE(7),
    FIGHT_PROP_DEFENSE(8),
    FIGHT_PROP_DEFENSE_PERCENT(9),
    FIGHT_PROP_BASE_SPEED(10),
    FIGHT_PROP_SPEED_PERCENT(11),
    FIGHT_PROP_HP_MP_PERCENT(12),
    FIGHT_PROP_ATTACK_MP_PERCENT(13),
    FIGHT_PROP_CRITICAL(20),
    FIGHT_PROP_ANTI_CRITICAL(21),
    FIGHT_PROP_CRITICAL_HURT(22),
    FIGHT_PROP_CHARGE_EFFICIENCY(23),
    FIGHT_PROP_ADD_HURT(24),
    FIGHT_PROP_SUB_HURT(25),
    FIGHT_PROP_HEAL_ADD(26),
    FIGHT_PROP_HEALED_ADD(27),
    FIGHT_PROP_ELEMENT_MASTERY(28),
    FIGHT_PROP_PHYSICAL_SUB_HURT(29),
    FIGHT_PROP_PHYSICAL_ADD_HURT(30),
    FIGHT_PROP_DEFENCE_IGNORE_RATIO(31),
    FIGHT_PROP_DEFENCE_IGNORE_DELTA(32),
    FIGHT_PROP_FIRE_ADD_HURT(40),
    FIGHT_PROP_ELEC_ADD_HURT(41),
    FIGHT_PROP_WATER_ADD_HURT(42),
    FIGHT_PROP_GRASS_ADD_HURT(43),
    FIGHT_PROP_WIND_ADD_HURT(44),
    FIGHT_PROP_ROCK_ADD_HURT(45),
    FIGHT_PROP_ICE_ADD_HURT(46),
    FIGHT_PROP_HIT_HEAD_ADD_HURT(47),
    FIGHT_PROP_FIRE_SUB_HURT(50),
    FIGHT_PROP_ELEC_SUB_HURT(51),
    FIGHT_PROP_WATER_SUB_HURT(52),
    FIGHT_PROP_GRASS_SUB_HURT(53),
    FIGHT_PROP_WIND_SUB_HURT(54),
    FIGHT_PROP_ROCK_SUB_HURT(55),
    FIGHT_PROP_ICE_SUB_HURT(56),
    FIGHT_PROP_EFFECT_HIT(60),
    FIGHT_PROP_EFFECT_RESIST(61),
    FIGHT_PROP_FREEZE_RESIST(62),
    FIGHT_PROP_DIZZY_RESIST(64),
    FIGHT_PROP_FREEZE_SHORTEN(65),
    FIGHT_PROP_DIZZY_SHORTEN(67),
    FIGHT_PROP_MAX_FIRE_ENERGY(70),
    FIGHT_PROP_MAX_ELEC_ENERGY(71),
    FIGHT_PROP_MAX_WATER_ENERGY(72),
    FIGHT_PROP_MAX_GRASS_ENERGY(73),
    FIGHT_PROP_MAX_WIND_ENERGY(74),
    FIGHT_PROP_MAX_ICE_ENERGY(75),
    FIGHT_PROP_MAX_ROCK_ENERGY(76),
    FIGHT_PROP_SKILL_CD_MINUS_RATIO(80),
    FIGHT_PROP_SHIELD_COST_MINUS_RATIO(81),
    FIGHT_PROP_CUR_FIRE_ENERGY(1000),
    FIGHT_PROP_CUR_ELEC_ENERGY(1001),
    FIGHT_PROP_CUR_WATER_ENERGY(1002),
    FIGHT_PROP_CUR_GRASS_ENERGY(1003),
    FIGHT_PROP_CUR_WIND_ENERGY(1004),
    FIGHT_PROP_CUR_ICE_ENERGY(1005),
    FIGHT_PROP_CUR_ROCK_ENERGY(1006),
    FIGHT_PROP_CUR_HP(1010),
    FIGHT_PROP_MAX_HP(2000),
    FIGHT_PROP_CUR_ATTACK(2001),
    FIGHT_PROP_CUR_DEFENSE(2002),
    FIGHT_PROP_CUR_SPEED(2003),
    FIGHT_PROP_NONEXTRA_ATTACK(3000),
    FIGHT_PROP_NONEXTRA_DEFENSE(3001),
    FIGHT_PROP_NONEXTRA_CRITICAL(3002),
    FIGHT_PROP_NONEXTRA_ANTI_CRITICAL(3003),
    FIGHT_PROP_NONEXTRA_CRITICAL_HURT(3004),
    FIGHT_PROP_NONEXTRA_CHARGE_EFFICIENCY(3005),
    FIGHT_PROP_NONEXTRA_ELEMENT_MASTERY(3006),
    FIGHT_PROP_NONEXTRA_PHYSICAL_SUB_HURT(3007),
    FIGHT_PROP_NONEXTRA_FIRE_ADD_HURT(3008),
    FIGHT_PROP_NONEXTRA_ELEC_ADD_HURT(3009),
    FIGHT_PROP_NONEXTRA_WATER_ADD_HURT(3010),
    FIGHT_PROP_NONEXTRA_GRASS_ADD_HURT(3011),
    FIGHT_PROP_NONEXTRA_WIND_ADD_HURT(3012),
    FIGHT_PROP_NONEXTRA_ROCK_ADD_HURT(3013),
    FIGHT_PROP_NONEXTRA_ICE_ADD_HURT(3014),
    FIGHT_PROP_NONEXTRA_FIRE_SUB_HURT(3015),
    FIGHT_PROP_NONEXTRA_ELEC_SUB_HURT(3016),
    FIGHT_PROP_NONEXTRA_WATER_SUB_HURT(3017),
    FIGHT_PROP_NONEXTRA_GRASS_SUB_HURT(3018),
    FIGHT_PROP_NONEXTRA_WIND_SUB_HURT(3019),
    FIGHT_PROP_NONEXTRA_ROCK_SUB_HURT(3020),
    FIGHT_PROP_NONEXTRA_ICE_SUB_HURT(3021),
    FIGHT_PROP_NONEXTRA_SKILL_CD_MINUS_RATIO(3022),
    FIGHT_PROP_NONEXTRA_SHIELD_COST_MINUS_RATIO(3023),
    FIGHT_PROP_NONEXTRA_PHYSICAL_ADD_HURT(3024),
}

enum class PlayerProp(override val value: Int) : PropEnum {
    PROP_NONE(0),
    PROP_EXP(1001),
    PROP_BREAK_LEVEL(1002),
    PROP_SATIATION_VAL(1003),
    PROP_SATIATION_PENALTY_TIME(1004),
    PROP_GEAR_START_VAL(2001),
    PROP_GEAR_STOP_VAL(2002),
    PROP_LEVEL(4001),
    PROP_LAST_CHANGE_AVATAR_TIME(10001),
    PROP_MAX_SPRING_VOLUME(10002), // Maximum volume of the Statue of the Seven for the player [0, 8500000]
    PROP_CUR_SPRING_VOLUME(10003), // Current volume of the Statue of the Seven [0, PROP_MAX_SPRING_VOLUME]
    PROP_IS_SPRING_AUTO_USE(10004), // Auto HP recovery when approaching the Statue of the Seven [0, 1]
    PROP_SPRING_AUTO_USE_PERCENT(10005), // Auto HP recovery percentage [0, 100]
    PROP_IS_FLYABLE(10006), // Are you in a state that disables your flying ability? e.g. new player [0, 1]
    PROP_IS_WEATHER_LOCKED(10007),
    PROP_IS_GAME_TIME_LOCKED(10008),
    PROP_IS_TRANSFERABLE(10009), // Does player unlock waypoint for transfer
    PROP_MAX_STAMINA(10010), // Maximum stamina of the player (0 - 24000)
    PROP_CUR_PERSIST_STAMINA(10011), // Used stamina of the player (0 - PROP_MAX_STAMINA)
    PROP_CUR_TEMPORARY_STAMINA(10012),
    PROP_PLAYER_LEVEL(10013),
    PROP_PLAYER_EXP(10014),
    PROP_PLAYER_HCOIN(10015), // Primogem (-inf, +inf)
    PROP_PLAYER_SCOIN(10016), // Mora [0, +inf)
    PROP_PLAYER_MP_SETTING_TYPE(10017), // Do you allow other players to join your game? [0=no 1=direct 2=approval]
    PROP_IS_MP_MODE_AVAILABLE(10018), // 0 if in quest or something that disables MP [0, 1]
    PROP_PLAYER_WORLD_LEVEL(10019), // [0, 8]
    PROP_PLAYER_RESIN(10020), // Original Resin [0, +inf)
    PROP_PLAYER_WAIT_SUB_HCOIN(10022),
    PROP_PLAYER_WAIT_SUB_SCOIN(10023),
    PROP_IS_ONLY_MP_WITH_PS_PLAYER(10024), // Is only MP with PlayStation players? [0, 1]
    PROP_PLAYER_MCOIN(10025), // Genesis Crystal (-inf, +inf) see 10015
    PROP_PLAYER_WAIT_SUB_MCOIN(10026),
    PROP_PLAYER_LEGENDARY_KEY(10027), // Legendary story key
    PROP_IS_HAS_FIRST_SHARE(10028),
    PROP_PLAYER_FORGE_POINT(10029), // Daily forge [0, 300000]
    PROP_CUR_CLIMATE_METER(10035),
    PROP_CUR_CLIMATE_TYPE(10036),
    PROP_CUR_CLIMATE_AREA_ID(10037),
    PROP_CUR_CLIMATE_AREA_CLIMATE_TYPE(10038),
    PROP_PLAYER_WORLD_LEVEL_LIMIT(10039),
    PROP_PLAYER_WORLD_LEVEL_ADJUST_CD(10040),
    PROP_PLAYER_LEGENDARY_DAILY_TASK_NUM(10041), // Amount of tasks for unlocking the legendary story
    PROP_PLAYER_HOME_COIN(10042), // Realm currency [0, +inf)
    PROP_PLAYER_WAIT_SUB_HOME_COIN(10043),
    PROP_IS_AUTO_UNLOCK_SPECIFIC_EQUIP(10044),
}

enum class EnterReason(val value: Int) {
    NONE(0),
    LOGIN(1),
    DUNGEON_REPLAY(11),
    DUNGEON_REVIVE_ON_WAYPOINT(12),
    DUNGEON_ENTER(13),
    DUNGEON_QUIT(14),
    GM(21),
    QUEST_ROLLBACK(31),
    REVIVAL(32),
    PERSONAL_SCENE(41),
    TRANS_POINT(42),
    CLIENT_TRANSMIT(43),
    FORCE_DRAG_BACK(44),
    TEAM_KICK(51),
    TEAM_JOIN(52),
    TEAM_BACK(53),
    MUIP(54),
    DUNGEON_INVITE_ACCEPT(55),
    LUA(56),
    ACTIVITY_LOAD_TERRAIN(57),
    HOST_FROM_SINGLE_TO_MP(58),
    MP_PLAY(59),
    ANCHOR_POINT(60),
    LUA_SKIP_UI(61),
    RELOAD_TERRAIN(62),
    DRAFT_TRANSFER(63),
    ENTER_HOME(64),
    EXIT_HOME(65),
    CHANGE_HOME_MODULE(66),
    GALLERY(67),
    HOME_SCENE_JUMP(68),
    HIDE_AND_SEEK(69),
}

enum class ItemType(val value: Int) {
    ITEM_NONE(0),
    ITEM_VIRTUAL(1),
    ITEM_MATERIAL(2),
    ITEM_RELIQUARY(3),
    ITEM_WEAPON(4),
    ITEM_DISPLAY(5),
    ITEM_FURNITURE(6)
}

enum class AnimatorParamType(override val value: Int) : PropEnum {
    TRIGGER(0),
    BOOL(1),
    INT(2),
    FLOAT(3)
}

enum class WorldType(val value: Int) {
    WORLD_NONE(0),
    WORLD_PLAYER(1),
    WORLD_HOME(2)
}
