DROP DATABASE IF EXISTS hospital;
CREATE DATABASE hospital;
USE hospital;

CREATE TABLE atendente (
    id VARCHAR(10),

    nome VARCHAR(256),
    email VARCHAR(256),
    cpf VARCHAR(256),
    
    cep VARCHAR(256),
    bairro VARCHAR(256),
    rua VARCHAR(256),
    numero VARCHAR(256),
    cidade VARCHAR(256),
    nacionalidade VARCHAR(256),
    
    senha VARCHAR(256),

    contratado BOOLEAN,
    
    PRIMARY KEY (id)
) ENGINE = InnoDB;

CREATE TABLE medico (
    id VARCHAR(10),

    nome VARCHAR(256),
    email VARCHAR(256),
    crm VARCHAR(256),
    
    cep VARCHAR(256),
    bairro VARCHAR(256),
    rua VARCHAR(256),
    numero VARCHAR(256),
    cidade VARCHAR(256),
    nacionalidade VARCHAR(256),
    
    senha VARCHAR(256),

    contratado BOOLEAN,
    
    PRIMARY KEY (id)
) ENGINE = InnoDB;

CREATE TABLE paciente (
    id VARCHAR(10),

    nome VARCHAR(256),
    email VARCHAR(256),
    cpf VARCHAR(256),
    
    cep VARCHAR(256),
    bairro VARCHAR(256),
    rua VARCHAR(256),
    numero VARCHAR(256),
    cidade VARCHAR(256),
    nacionalidade VARCHAR(256),
    
    senha VARCHAR(256),

    contratado boolean,
    
    PRIMARY KEY (id)
) ENGINE = InnoDB;

CREATE TABLE historicoDePaciente (
    doenca VARCHAR (256),
    dataConsulta VARCHAR(256),
	sintomas VARCHAR (1000),
    idPaciente VARCHAR(10),
    idAtendente VARCHAR(10),
    idMedico VARCHAR(10),
    examePdf LONGBLOB,

    FOREIGN KEY (idPaciente) REFERENCES paciente(id),
    FOREIGN KEY (idAtendente) REFERENCES atendente(id),
    FOREIGN KEY (idMedico) REFERENCES medico(id)
) ENGINE = InnoDB;

# INSERÇÃO DE TESTE

INSERT INTO atendente VALUES
(
    'A1',

    'Josivaldison Pereira',
    'Josival2001@gmail.com',
    '123.634.673-44',
    
    '13010-100',
    'Centro',
    'Praça Rodrigo Octávio',
    '000125',
    'Campinas',
    'Brasileiro',
    
    'pudim123',

    true
);

# INSERÇÃO DE TESTE
INSERT INTO medico VALUES
(
    'M1',

    'Olga Marilênica',
    'Olguinha96@gmail.com',
    '231.321.356-44',
    
    '13010-110',
    'Centro',
    'Rua General Osório',
    '000760',
    'Campinas',
    'Brasileiro',
    
    'pudim123',

    true
);
# INSERÇÃO DE TESTE
INSERT INTO medico VALUES
(
    'M2',

    'Gregory House',
    'thegreg@gmail.com',
    '222.123.643-44',
    
    '13010-110',
    'Centro',
    'Rua General Osório',
    '000761',
    'Campinas',
    'Americano',
    
    'pudim123',

    true
);

# INSERÇÃO DE TESTE
INSERT INTO medico VALUES
(
    'M3',

    'Meredith Grey',
    'meredithtonsdecinza@gmail.com',
    '643.123.532-88',
    
    '13010-130',
    'Centro',
    'Praça Guilherme de Almeida',
    '000255',
    'Campinas',
    'Americano',
    
    'pudim123',

    true
);

# INSERÇÃO DE TESTE
INSERT INTO medico VALUES
(
    'M4',

    'Shaun Murphy',
    'fallout4shaun@gmail.com',
    '767.243.903-12',
    
    '13010-130',
    'Centro',
    'Praça Guilherme de Almeida',
    '000960',
    'Campinas',
    'Americano',
    
    'pudim123',

    true
);

# INSERÇÃO DE TESTE
INSERT INTO medico VALUES
(
    'M5',

    'Conrad Hawkins',
    'comradehawkins@protonmail.com',
    '962.125.416-69',
    
    '13010-130',
    'Centro',
    'Avenida Benjamin Constant',
    '000711',
    'Campinas',
    'Americano',
    
    'pudim123',

    true
);



# INSERÇÃO DE TESTE
INSERT INTO paciente VALUES
(
    'P1',

    'Melene Pinheiro',
    'Melenice@gmail.com',
    '014.565.564-92',
    
    '13010-120',
    'Centro',
    'Rua do Rocio',
    '000256',
    'Campinas',
    'Brasileiro',
    
    'pudim123',
    
    true

    );
    
INSERT INTO historicoDePaciente values ( 
	'Gripe', 
	'23/10/2017', 
	'Dor de cabeça com coriza e dor atrás dos olhos. Também apresentava um mal estar e febre.', 
	'P1', 
	'A1', 
	'M1', 
	'null');