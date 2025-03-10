DROP TABLE IF EXISTS ip2country;

CREATE TABLE ip2country
(
       `id`           INT          not null auto_increment primary key,
       `country_code` VARCHAR(10)  not null,
       `country_name` VARCHAR(100) not null,
       `ip_from`      BIGINT       not null,
       `ip_to`        BIGINT       not null
);

insert into ip2country (id, country_code, country_name, ip_from, ip_to)
values (1, 'AR', 'Argentina', 961540096, 961542143),
       (2, 'AR', 'Argentina', 1371586048, 1371586303),
       (3, 'AR', 'Argentina', 1432264704, 1432272895),
       (4, 'AR', 'Argentina', 1538998272, 1539006463),
       (5, 'AR', 'Argentina', 1586417152, 1586417663),
       (6, 'AR', 'Argentina', 1836015616, 1836023807),
       (7, 'AR', 'Argentina', 3104060416, 3104061439),
       (8, 'AR', 'Argentina', 3105947648, 3105948671),
       (9, 'AR', 'Argentina', 3109495808, 3109498879),
       (10, 'AR', 'Argentina', 3110763520, 3110764543),
       (11, 'DE', 'Germany', 34604544, 34605055),
       (12, 'DE', 'Germany', 34606592, 34607103),
       (13, 'DE', 'Germany', 34608896, 34609663),
       (14, 'DE', 'Germany', 34610176, 34611711),
       (15, 'DE', 'Germany', 34613248, 34613503),
       (16, 'DE', 'Germany', 34614784, 34615807),
       (17, 'DE', 'Germany', 34616064, 34616575),
       (18, 'DE', 'Germany', 34616832, 34617087),
       (19, 'DE', 'Germany', 34618624, 34619135),
       (20, 'DE', 'Germany', 34628608, 34629119),
       (21, 'BR', 'Brazil', 17170432, 17301503),
       (22, 'BR', 'Brazil', 18219008, 18332159),
       (23, 'BR', 'Brazil', 18332416, 18350079),
       (24, 'BR', 'Brazil', 19267584, 19398655),
       (25, 'BR', 'Brazil', 28966912, 29015551),
       (26, 'BR', 'Brazil', 29015808, 29097983),
       (27, 'BR', 'Brazil', 84034304, 84034559),
       (28, 'BR', 'Brazil', 87957760, 87958015),
       (29, 'BR', 'Brazil', 90532864, 90533119),
       (30, 'BR', 'Brazil', 208384000, 208384255),
       (31, 'UK', 'United Kingdom', 34605056, 34605311),
       (32, 'UK', 'United Kingdom', 34607104, 34607615),
       (33, 'UK', 'United Kingdom', 34612736, 34613247),
       (34, 'UK', 'United Kingdom', 34621440, 34621951),
       (35, 'UK', 'United Kingdom', 34622976, 34623487),
       (36, 'UK', 'United Kingdom', 34630656, 34630911),
       (37, 'UK', 'United Kingdom', 34662144, 34662399),
       (38, 'UK', 'United Kingdom', 34663680, 34663935),
       (39, 'UK', 'United Kingdom', 34677504, 34677759),
       (40, 'UK', 'United Kingdom', 34678016, 34678271),
       (41, 'IT', 'Italy', 34608640, 34608895),
       (42, 'IT', 'Italy', 34609664, 34609919),
       (43, 'IT', 'Italy', 34623488, 34623999),
       (44, 'IT', 'Italy', 34625024, 34625535),
       (45, 'IT', 'Italy', 34638848, 34639359),
       (46, 'IT', 'Italy', 34648320, 34648575),
       (47, 'IT', 'Italy', 34651136, 34652159),
       (48, 'IT', 'Italy', 34693120, 34698239),
       (49, 'IT', 'Italy', 34700288, 34701311),
       (50, 'IT', 'Italy', 87562240, 87564287),
       (51, 'UA', 'Ukraine', 34721024, 34721791),
       (52, 'UA', 'Ukraine', 83951616, 83959807),
       (53, 'UA', 'Ukraine', 84418560, 84418815),
       (54, 'UA', 'Ukraine', 84425728, 84425983),
       (55, 'UA', 'Ukraine', 84426240, 84426495),
       (56, 'UA', 'Ukraine', 85367808, 85368831),
       (57, 'UA', 'Ukraine', 86159360, 86160383),
       (58, 'UA', 'Ukraine', 86160896, 86161407),
       (59, 'UA', 'Ukraine', 87388160, 87390207),
       (60, 'UA', 'Ukraine', 87638016, 87640063),
       (61, 'CA', 'Cameroon', 759299584, 759300095),
       (62, 'CA', 'Cameroon', 961269760, 961273855),
       (63, 'CA', 'Cameroon', 1078782464, 1078782719),
       (64, 'CA', 'Cameroon', 1081385216, 1081385471),
       (65, 'CA', 'Cameroon', 1081387776, 1081388031),
       (66, 'CA', 'Cameroon', 1081391104, 1081393151),
       (67, 'CA', 'Cameroon', 1081460736, 1081462783),
       (68, 'CA', 'Cameroon', 1086358016, 1086358271),
       (69, 'CA', 'Cameroon', 1087715328, 1087717375),
       (70, 'CA', 'Cameroon', 1087862784, 1087864831),
       (71, 'IE', 'Ireland', 234954752, 234961663),
       (72, 'IE', 'Ireland', 234961920, 234971135),
       (73, 'IE', 'Ireland', 243270656, 243271679),
       (74, 'IE', 'Ireland', 386248704, 386252799),
       (75, 'IE', 'Ireland', 388730880, 388734975),
       (76, 'IE', 'Ireland', 390148096, 390152191),
       (77, 'IE', 'Ireland', 400045568, 400045823),
       (78, 'IE', 'Ireland', 453044480, 453044735),
       (79, 'IE', 'Ireland', 459292672, 459293695),
       (81, 'IE', 'Ireland', 460224512, 460226559),
       (82, 'US', 'United States', 18332160, 18332415),
       (83, 'US', 'United States', 29015552, 29015807),
       (84, 'US', 'United States', 34611968, 34612223),
       (85, 'US', 'United States', 34619392, 34619647),
       (86, 'US', 'United States', 34620928, 34621439),
       (87, 'US', 'United States', 34625536, 34626303),
       (88, 'US', 'United States', 34629632, 34630143),
       (89, 'US', 'United States', 34631168, 34631679),
       (90, 'US', 'United States', 34640384, 34641407),
       (91, 'US', 'United States', 34641920, 34642175)
;