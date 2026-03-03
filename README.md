# Object Deserialization Issue

## Sent payload to echo:
```json
{
  "gender": "MALE_WIZARD",
  "mana": 10
}
```

## Expected response:
```json
{
  "gender": "MALE_WIZARD",
  "mana": 10
}
```

## Actual response:
```json
{
  "gender": "FEMALE_WIZARD",
  "mana": 10
}
```

