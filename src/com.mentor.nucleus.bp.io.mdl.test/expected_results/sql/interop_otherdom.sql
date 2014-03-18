-- BP 6.1D content: domain syschar: 3

INSERT INTO S_DOM
	VALUES (24033248,
	'interop_otherdom',
	'This domain is a helper domain for domains needing to wire bridges to functions.',
	0,
	1);
INSERT INTO S_CDT
	VALUES (524289,
	0);
INSERT INTO S_DT
	VALUES (524289,
	24033248,
	'void',
	'');
INSERT INTO S_CDT
	VALUES (524290,
	1);
INSERT INTO S_DT
	VALUES (524290,
	24033248,
	'boolean',
	'');
INSERT INTO S_CDT
	VALUES (524291,
	2);
INSERT INTO S_DT
	VALUES (524291,
	24033248,
	'integer',
	'');
INSERT INTO S_CDT
	VALUES (524292,
	3);
INSERT INTO S_DT
	VALUES (524292,
	24033248,
	'real',
	'');
INSERT INTO S_CDT
	VALUES (524293,
	4);
INSERT INTO S_DT
	VALUES (524293,
	24033248,
	'string',
	'');
INSERT INTO S_CDT
	VALUES (524294,
	5);
INSERT INTO S_DT
	VALUES (524294,
	24033248,
	'unique_id',
	'');
INSERT INTO S_CDT
	VALUES (524295,
	6);
INSERT INTO S_DT
	VALUES (524295,
	24033248,
	'state<State_Model>',
	'');
INSERT INTO S_CDT
	VALUES (524296,
	7);
INSERT INTO S_DT
	VALUES (524296,
	24033248,
	'same_as<Base_Attribute>',
	'');
INSERT INTO S_CDT
	VALUES (524297,
	8);
INSERT INTO S_DT
	VALUES (524297,
	24033248,
	'inst_ref<Object>',
	'');
INSERT INTO S_CDT
	VALUES (524298,
	9);
INSERT INTO S_DT
	VALUES (524298,
	24033248,
	'inst_ref_set<Object>',
	'');
INSERT INTO S_CDT
	VALUES (524299,
	10);
INSERT INTO S_DT
	VALUES (524299,
	24033248,
	'inst<Event>',
	'');
INSERT INTO S_CDT
	VALUES (524300,
	11);
INSERT INTO S_DT
	VALUES (524300,
	24033248,
	'inst<Mapping>',
	'');
INSERT INTO S_CDT
	VALUES (524301,
	12);
INSERT INTO S_DT
	VALUES (524301,
	24033248,
	'inst_ref<Mapping>',
	'');
INSERT INTO S_UDT
	VALUES (524302,
	524300,
	1);
INSERT INTO S_DT
	VALUES (524302,
	24033248,
	'date',
	'');
INSERT INTO S_UDT
	VALUES (524303,
	524300,
	2);
INSERT INTO S_DT
	VALUES (524303,
	24033248,
	'timestamp',
	'');
INSERT INTO S_UDT
	VALUES (524304,
	524301,
	3);
INSERT INTO S_DT
	VALUES (524304,
	24033248,
	'inst_ref<Timer>',
	'');
INSERT INTO S_UDT
	VALUES (524305,
	524294,
	0);
INSERT INTO S_DT
	VALUES (524305,
	24033248,
	'arbitrary_id',
	'Arbitrary ID with core data type of unique_id.');
INSERT INTO S_SYNC
	VALUES (524289,
	24033248,
	'NoParam',
	'',
	'return 42;',
	524291,
	1);
INSERT INTO S_SYNC
	VALUES (524290,
	24033248,
	'ByRef',
	'',
	'ret_val = param.ref / 7;
param.ref = 7;
return ret_val;',
	524291,
	1);
INSERT INTO S_SPARM
	VALUES (524289,
	524290,
	'ref',
	524291,
	1);
INSERT INTO S_SYNC
	VALUES (524291,
	24033248,
	'ByVal',
	'',
	'return param.val / 2;',
	524291,
	1);
INSERT INTO S_SPARM
	VALUES (524290,
	524291,
	'val',
	524291,
	0);
INSERT INTO S_SYNC
	VALUES (524292,
	24033248,
	'Combo',
	'',
	'ret_val = param.ref * param.val * 2;
param.ref = ret_val;
return ret_val;',
	524291,
	1);
INSERT INTO S_SPARM
	VALUES (524291,
	524292,
	'ref',
	524291,
	1);
INSERT INTO S_SPARM
	VALUES (524292,
	524292,
	'val',
	524291,
	0);
INSERT INTO GD_MD
	VALUES (524289,
	1,
	24033248,
	1,
	1,
	0,
	1,
	1,
	0,
	12,
	1615,
	4245,
	1.000000,
	0);
INSERT INTO GD_GE
	VALUES (524301,
	524289,
	3145734,
	11);
INSERT INTO GD_SHP
	VALUES (524301,
	1872,
	1328,
	2032,
	1424);
INSERT INTO S_SS
	VALUES (3145734,
	'Unnamed Subsystem',
	'',
	'',
	1,
	24033248,
	3145734);
INSERT INTO O_OBJ
	VALUES (3145729,
	'Unknown Class',
	1,
	'KEY',
	'',
	3145734);
INSERT INTO O_NBATTR
	VALUES (3145729,
	3145729);
INSERT INTO O_BATTR
	VALUES (3145729,
	3145729);
INSERT INTO O_ATTR
	VALUES (3145729,
	3145729,
	0,
	'current_state',
	'',
	'',
	'current_state',
	0,
	524295);
INSERT INTO SM_ISM
	VALUES (3670023,
	3145729);
INSERT INTO SM_SM
	VALUES (3670023,
	'',
	7);
INSERT INTO SM_MOORE
	VALUES (3670023);
INSERT INTO SM_STATE
	VALUES (3670017,
	3670023,
	0,
	'State Name',
	1,
	0);
INSERT INTO SM_MOAH
	VALUES (3670017,
	3670023,
	3670017);
INSERT INTO SM_AH
	VALUES (3670017,
	3670023);
INSERT INTO SM_ACT
	VALUES (3670017,
	3670023,
	1,
	'',
	'');
INSERT INTO GD_MD
	VALUES (3670017,
	8,
	3670023,
	40,
	1,
	0,
	1,
	1,
	0,
	12,
	1600,
	4199,
	1.000000,
	0);
INSERT INTO GD_GE
	VALUES (3670018,
	3670017,
	3670017,
	41);
INSERT INTO GD_SHP
	VALUES (3670018,
	1808,
	1312,
	2032,
	1472);
INSERT INTO GD_MD
	VALUES (3145729,
	5,
	3145734,
	11,
	1,
	0,
	1,
	1,
	0,
	12,
	1600,
	4199,
	1.000000,
	0);
INSERT INTO GD_GE
	VALUES (3145732,
	3145729,
	3145729,
	21);
INSERT INTO GD_SHP
	VALUES (3145732,
	1872,
	1360,
	2032,
	1488);
