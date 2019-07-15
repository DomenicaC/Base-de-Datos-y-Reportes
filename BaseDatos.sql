PGDMP                         w            BaseDatosReportes    11.4    11.4 
               0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false                       1262    16440    BaseDatosReportes    DATABASE     �   CREATE DATABASE "BaseDatosReportes" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Spanish_Ecuador.1252' LC_CTYPE = 'Spanish_Ecuador.1252';
 #   DROP DATABASE "BaseDatosReportes";
             postgres    false            �            1259    16458 	   DIRECCION    TABLE     �   CREATE TABLE public."DIRECCION" (
    "DIR_CODIGO" integer NOT NULL,
    "DIR_CALLEPRINCIPAL" text,
    "DIR_CALLESECUNDARIA" text,
    "DIR_NUMERO" integer,
    "DIR_PER_CEDULA" text
);
    DROP TABLE public."DIRECCION";
       public         postgres    false            �            1259    16441    PERSONA    TABLE     �   CREATE TABLE public."PERSONA" (
    "PER_CEDULA" text NOT NULL,
    "PER_NOMBRE" text,
    "PER_APELLIDO" text,
    "PER_EDAD" integer,
    "PER_FECHA" date,
    "PER_TELEFONO" text,
    "PER_SUELDO" double precision,
    "PER_GENERO" text
);
    DROP TABLE public."PERSONA";
       public         postgres    false            �
          0    16458 	   DIRECCION 
   TABLE DATA               �   COPY public."DIRECCION" ("DIR_CODIGO", "DIR_CALLEPRINCIPAL", "DIR_CALLESECUNDARIA", "DIR_NUMERO", "DIR_PER_CEDULA") FROM stdin;
    public       postgres    false    197   �
       �
          0    16441    PERSONA 
   TABLE DATA               �   COPY public."PERSONA" ("PER_CEDULA", "PER_NOMBRE", "PER_APELLIDO", "PER_EDAD", "PER_FECHA", "PER_TELEFONO", "PER_SUELDO", "PER_GENERO") FROM stdin;
    public       postgres    false    196   y       �
           2606    16465    DIRECCION DIRECCION_pkey 
   CONSTRAINT     d   ALTER TABLE ONLY public."DIRECCION"
    ADD CONSTRAINT "DIRECCION_pkey" PRIMARY KEY ("DIR_CODIGO");
 F   ALTER TABLE ONLY public."DIRECCION" DROP CONSTRAINT "DIRECCION_pkey";
       public         postgres    false    197            �
           2606    16448    PERSONA PERSONAS_pkey 
   CONSTRAINT     a   ALTER TABLE ONLY public."PERSONA"
    ADD CONSTRAINT "PERSONAS_pkey" PRIMARY KEY ("PER_CEDULA");
 C   ALTER TABLE ONLY public."PERSONA" DROP CONSTRAINT "PERSONAS_pkey";
       public         postgres    false    196            �
   �   x�m�=
�0@�Y>�N�?���-Za�z�s�@����,dQ�\x�����*��]�3��0-!�U�"O��{/��*����k��wy�������h1t+S�Yz��Ƶ$~q�HW�3c���(�      �
   �  x����r�8���w�%����$13!E �T%�/��4/6�`l� {#�J�>�;x��qRzcľ{����O��ϲ�A������J�`�3ʂ��ݩp>ď��݃m�:�x-��oU_}
�B�B�B"�Ay�BI�;���๘��ymQ<~�]+~�ï��{S��޼ՠ��P֨�r���th�zt_���/�P����A�<2R��j���ܹ�A×b]@�M�r([Z�s9�BK*g����tCk����hM��Qǫ�Vݏ����U[4��Gz�G�gu���/�S��} 	�}'��6�W((��XM��;�����F@CM���M�>Q�t��e(`��R'��.��<��(�Nߖ��Cٿ�U��	��Bn̨�A�4��ZO� j4�:4�w����յ�;]ȹj���� �n�t��r�jۚ���6��-����qlg5�� ��g�� ��J��P�׮/�.	�M&V6�[Ք4*�$��#tKZ�y�i�ádf� <��u����i�Rk\P��磍'U��߂f&&�Ί*�Fw6Z��{��c{*�2t`�')�e�~\`�i����i.X�M.)�I����S�D�Mw�"9�3 �	5b��)��	�) �]Ir4�8#EHz�-e|�L�l�M���?���l��f&�ʔǪ��?�ѲƐ��]5?")ޟs7��{�)F���Hk��2a���Ԏn�=��%Ƣu�s+{�T�Z~d��H��f�\&V�Q�w�E�$�J|.^&/r�Č��F��C����Hkˇ{Qk�s>�ݨ�ɋ0�|N<�\>���ܧ�3��'��w�fA:�B�t�D���\Ͼ�P�����%B�%�1�9�3'M�g�t�}C�s��L��9ip���D��`���ʈ�KF|:#�`0������Xc_2a��tF̂�WZ*#6ƈNcd������B���d|��*	�+	.%QQI�4w%�ג�$d�+@�"bp�6�����|�8e~�9L%��3��f_�U>f^e��f���1_fz���0
��7ƈ`��%��p��`@��̄\��H��I��Q1J�%n��hp�=J�
%��hpY�V)�%p��R1J�%x��QLI�I�k�@�`J�_?�kJ F	0%���%��%�N��B�_R�7Q◔�M����[(�J�&J�%:���Ht*$~ɈNf�/ѩ��#:��vl��     