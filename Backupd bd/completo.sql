--
-- PostgreSQL database dump
--

-- Dumped from database version 9.6.2
-- Dumped by pg_dump version 9.6.2

-- Started on 2018-05-21 22:16:45

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 228 (class 1259 OID 28535)
-- Name: accesorio; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE accesorio (
    id bigint NOT NULL,
    foto character varying(255),
    nombre character varying(255),
    precio integer,
    tipo character varying(255)
);


ALTER TABLE accesorio OWNER TO postgres;

--
-- TOC entry 2329 (class 0 OID 28535)
-- Dependencies: 228
-- Data for Name: accesorio; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY accesorio (id, foto, nombre, precio, tipo) FROM stdin;
3	https://i.pinimg.com/564x/45/78/01/45780160965e17e8066cd660580ac177.jpg	Espejos retrovisores	\N	Generico
1	https://i.linio.com/p/82b2d844d57b2f29b9a7fd5b6c502db7-product.jpg	Soporte para GoPro	\N	Generico
2	https://ae01.alicdn.com/kf/HTB14q3CRVXXXXaiXXXXq6xXFXXXn/Bicicleta-titular-linterna-manillar-Accesorios-de-bicicleta-extender-Mount-soporte-de-l-mpara-luces-de-camping.jpg	Soporte de lámpara	\N	Generico
4	https://i.pinimg.com/564x/13/d9/ed/13d9ed1cfe073bf37a6a2dba7b1ea063.jpg	Casco para bicicleta Hombre	\N	Indispensable
5	https://i.pinimg.com/564x/8e/3a/c3/8e3ac31b5c8263e26aea561342ec7afe.jpg	Guantes para bicicleta	\N	Indispensable
\.


--
-- TOC entry 2211 (class 2606 OID 28542)
-- Name: accesorio accesorio_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY accesorio
    ADD CONSTRAINT accesorio_pkey PRIMARY KEY (id);


-- Completed on 2018-05-21 22:16:45

--
-- PostgreSQL database dump complete
--


--
-- PostgreSQL database dump
--

-- Dumped from database version 9.6.2
-- Dumped by pg_dump version 9.6.2

-- Started on 2018-05-21 22:18:47

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 230 (class 1259 OID 28551)
-- Name: bonificacion; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE bonificacion (
    id bigint NOT NULL,
    configuracion character varying(255),
    imagen character varying(255),
    nombre character varying(255)
);


ALTER TABLE bonificacion OWNER TO postgres;

--
-- TOC entry 2329 (class 0 OID 28551)
-- Dependencies: 230
-- Data for Name: bonificacion; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY bonificacion (id, configuracion, imagen, nombre) FROM stdin;
1	Descuento del 10% en tu próximo alquiler	http://www.dolmencr.com/descuentos-especiales-01.png	Descuento en alquiler
2	Descuento del 50% en tu próximo alquiler	https://ugc.kn3.net/i/origin/http://www.psicoglobal.com/img/descuento-50.jpg	Descuento en alquiler
3	Próximo alquiler gratuito	https://i1.wp.com/finanzasyproyectos.net/wp-content/uploads/2016/01/sale-606687_1280.jpg?resize=620%2C264&ssl=1	Descuento en alquiler
\.


--
-- TOC entry 2211 (class 2606 OID 28558)
-- Name: bonificacion bonificacion_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY bonificacion
    ADD CONSTRAINT bonificacion_pkey PRIMARY KEY (id);


-- Completed on 2018-05-21 22:18:48

--
-- PostgreSQL database dump complete
--

--
-- PostgreSQL database dump
--

-- Dumped from database version 9.6.2
-- Dumped by pg_dump version 9.6.2

-- Started on 2018-05-21 22:16:03

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 232 (class 1259 OID 28564)
-- Name: logro; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE logro (
    id bigint NOT NULL,
    imagen character varying(255),
    nombre character varying(255),
    valor integer
);


ALTER TABLE logro OWNER TO postgres;

--
-- TOC entry 2329 (class 0 OID 28564)
-- Dependencies: 232
-- Data for Name: logro; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY logro (id, imagen, nombre, valor) FROM stdin;
1	http://www.medallasmexico.com/site/images/cycling_06[1].jpg	Medalla de bronce a la ruta más larga	10
2	http://www.medallasmexico.com/site/images/bici[1].jpg	Medalla de plata a la ruta mas larga	20
3	http://www.medallasmexico.com/site/images/cycling_01[1].jpg	Medalla de oro a la ruta mas larga	30
\.


--
-- TOC entry 2211 (class 2606 OID 28571)
-- Name: logro logro_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY logro
    ADD CONSTRAINT logro_pkey PRIMARY KEY (id);


-- Completed on 2018-05-21 22:16:03

--
-- PostgreSQL database dump complete
--

--
-- PostgreSQL database dump
--

-- Dumped from database version 9.6.2
-- Dumped by pg_dump version 9.6.2

-- Started on 2018-05-21 22:15:47

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 233 (class 1259 OID 28572)
-- Name: marca; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE marca (
    id bigint NOT NULL,
    nombre character varying(255)
);


ALTER TABLE marca OWNER TO postgres;

--
-- TOC entry 2329 (class 0 OID 28572)
-- Dependencies: 233
-- Data for Name: marca; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY marca (id, nombre) FROM stdin;
1	Trek
2	Merida
3	Scott
4	Giant
5	Cannondale
\.


--
-- TOC entry 2211 (class 2606 OID 28576)
-- Name: marca marca_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY marca
    ADD CONSTRAINT marca_pkey PRIMARY KEY (id);


-- Completed on 2018-05-21 22:15:48

--
-- PostgreSQL database dump complete
--

--
-- PostgreSQL database dump
--

-- Dumped from database version 9.6.2
-- Dumped by pg_dump version 9.6.2

-- Started on 2018-05-21 22:15:28

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 238 (class 1259 OID 28597)
-- Name: proveedor; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE proveedor (
    id bigint NOT NULL,
    nombre character varying(255)
);


ALTER TABLE proveedor OWNER TO postgres;

--
-- TOC entry 2329 (class 0 OID 28597)
-- Dependencies: 238
-- Data for Name: proveedor; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY proveedor (id, nombre) FROM stdin;
1	Fabrica de Bicicletas
2	Ciclo Mejia
3	Bicicletas Duarte
\.


--
-- TOC entry 2211 (class 2606 OID 28601)
-- Name: proveedor proveedor_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY proveedor
    ADD CONSTRAINT proveedor_pkey PRIMARY KEY (id);


-- Completed on 2018-05-21 22:15:29

--
-- PostgreSQL database dump complete
--

--
-- PostgreSQL database dump
--

-- Dumped from database version 9.6.2
-- Dumped by pg_dump version 9.6.2

-- Started on 2018-05-21 22:16:27

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 229 (class 1259 OID 28543)
-- Name: bicicleta; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE bicicleta (
    id bigint NOT NULL,
    foto character varying(255),
    precio integer,
    precioalquiler integer,
    referencia character varying(255),
    serial bigint,
    marca_id bigint,
    proveedor_id bigint
);


ALTER TABLE bicicleta OWNER TO postgres;

--
-- TOC entry 2331 (class 0 OID 28543)
-- Dependencies: 229
-- Data for Name: bicicleta; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY bicicleta (id, foto, precio, precioalquiler, referencia, serial, marca_id, proveedor_id) FROM stdin;
1	https://cdn.needish.com/is-prod-deals/Fw1w6k3s9R1HGPhnZ5gBuw/scale/900x600.jpg	1500000	15000	Bicicleta Todoterreno con Freno de Disco y 18 Velocidades	1254789	1	1
2	https://i.linio.com/p/29a9dfe7eab3b9056da7dd513122c51c-product.jpg	1000000	10000	Bicicleta Todoterreno Rin 26 18 Cambios D/pared Color Negro	985632147	2	1
3	https://i.linio.com/p/709824ee990818b9571d86e40a08d8e6-product.jpg	1250000	12500	Bicicleta Rin 27.5 GW Piranha Gw 1.1 Shimano Tipo Moto 7 Vel	98564789	3	2
4	https://i.linio.com/p/2874ded21af24a276dcdf2df4736822d-product.jpg	500000	5000	Bicicleta Dama Rin 26 18 Cambios Tipo Moto	65871	4	2
5	https://s7d5.scene7.com/is/image/Specialized/?layer=0&wid=1920&hei=640&fmt=jpg&src=is{Specialized/background-white?wid=1920&hei=640}&layer=1&src=is{Specialized/209684?hei=600&wid=920&$hero$}	33000000	330000	S-Works Epic De Mujer	652148	5	2
6	https://s7d5.scene7.com/is/image/Specialized/?layer=0&wid=1920&hei=640&fmt=jpg&src=is{Specialized/background-white?wid=1920&hei=640}&layer=1&src=is{Specialized/186679?hei=600&wid=920&$hero$}	3300000	33000	S-Works Epic XX1 Eagle De Hombre	652147	5	1
7	https://s7d5.scene7.com/is/image/Specialized/?layer=0&wid=1920&hei=640&fmt=jpg&src=is{Specialized/background-white?wid=1920&hei=640}&layer=1&src=is{Specialized/186669?hei=600&wid=920&$hero$}	31000000	310000	S-Works Enduro 650b	12547	4	2
8	https://s7d5.scene7.com/is/image/Specialized/?layer=0&wid=1920&hei=640&fmt=jpg&src=is{Specialized/background-white?wid=1920&hei=640}&layer=1&src=is{Specialized/208799?hei=600&wid=920&$hero$}	29000000	290000	S-Works Epic Hardtail XTR Di2 De Hombre	569874	4	1
\.


--
-- TOC entry 2211 (class 2606 OID 28550)
-- Name: bicicleta bicicleta_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY bicicleta
    ADD CONSTRAINT bicicleta_pkey PRIMARY KEY (id);


--
-- TOC entry 2213 (class 2606 OID 28660)
-- Name: bicicleta fk_bicicleta_marca_id; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY bicicleta
    ADD CONSTRAINT fk_bicicleta_marca_id FOREIGN KEY (marca_id) REFERENCES marca(id);


--
-- TOC entry 2212 (class 2606 OID 28655)
-- Name: bicicleta fk_bicicleta_proveedor_id; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY bicicleta
    ADD CONSTRAINT fk_bicicleta_proveedor_id FOREIGN KEY (proveedor_id) REFERENCES proveedor(id);


-- Completed on 2018-05-21 22:16:28

--
-- PostgreSQL database dump complete
--

--
-- PostgreSQL database dump
--

-- Dumped from database version 9.6.2
-- Dumped by pg_dump version 9.6.2

-- Started on 2018-05-21 22:14:16

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 240 (class 1259 OID 28607)
-- Name: usuario; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE usuario (
    id bigint NOT NULL,
    "contraseÑa" character varying(255),
    nombredeusuario character varying(255),
    rol integer
);


ALTER TABLE usuario OWNER TO postgres;

--
-- TOC entry 2329 (class 0 OID 28607)
-- Dependencies: 240
-- Data for Name: usuario; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY usuario (id, "contraseÑa", nombredeusuario, rol) FROM stdin;
1	contrasenia123	cosmefulanito	1
\.


--
-- TOC entry 2211 (class 2606 OID 28614)
-- Name: usuario usuario_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY usuario
    ADD CONSTRAINT usuario_pkey PRIMARY KEY (id);


-- Completed on 2018-05-21 22:14:17

--
-- PostgreSQL database dump complete
--

